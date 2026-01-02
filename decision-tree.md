## Feathers Decision Tree – Dependency Removal

```mermaid
flowchart TD
    A[Dependency causes test pain] --> B{Can you change the code?}

    B -->|No| Z[Textual Redefinition as last resort]

    B -->|Yes| C{Is dependency created with new?}

    C -->|Yes| D{Can you add a method?}
    D -->|Yes| E[Extract & Override Factory Method]
    D -->|No| F[Expose Static Method or Introduce Static Setter]

    C -->|No| G{Is dependency stored in a field?}

    G -->|Yes| H{Is field overridable?}
    H -->|Yes| I[Supersede Instance Variable]
    H -->|No| J[Replace Global Reference with Getter or Encapsulate Global Reference]

    G -->|No| K{Can you change method signature?}

    K -->|Yes| L[Parameterize Method or Adapt Parameter]
    K -->|No| M{Is behavior part of a larger algorithm?}

    M -->|Yes| N[Template Redefinition or Break Out Method Object]
    M -->|No| O{Is logic tied to a concrete class?}

    O -->|Yes| P[Extract Interface or Extract Implementer]
    O -->|No| Q[Subclass and Override Method]
