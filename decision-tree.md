## Feathers Decision Tree – Dependency Removal

```mermaid
flowchart TD
    A[Dependency causes test pain] --> B{Can you change the code?}

    B -->|No| Z1[Link Substitution]
    Z1 --> Z[Textual Redefinition as last resort]

    B -->|Yes| C{Is dependency created with new?}

    C -->|Yes| D{Can you add a method?}
    D -->|Yes| E[Extract & Override Factory Method]
    D -->|No| F[Expose Static Method or Introduce Static Setter]

    C -->|No| G{Is dependency stored in a field?}

    G -->|Yes| H{Is field overridable?}
    H -->|Yes| I[Supersede Instance Variable or Introduce Instance Delegator]
    H -->|No| J[Replace Global Reference with Getter or Encapsulate Global Reference]

    G -->|No| K{Can you change method signature?}

    K -->|Yes| L[Parameterize Method or Adapt Parameter] 
    
    L --> L1[Definition Completion]
    L --> L2[Replace Function with Function Pointer]
    L --> L3[Parameterize Constructor]
    L --> L4[Primitivize Parameter]
    K -->|No| M{Is behavior part of a larger algorithm?}

    M -->|Yes| N1[Extract & Override Call]
    N1 --> N[Template Redefinition or Break Out Method Object]
    M -->|No| O{Is logic tied to a concrete class?}
    O -->|Shared behavior| P1[Pull Up Feature]
    O -->|Dependency only needed in subclass| P2[Push Down Dependency]
    O -->|Need abstraction| P3[Extract Interface / Extract Implementer]
    O -->|No| Q[Subclass and Override Method]
