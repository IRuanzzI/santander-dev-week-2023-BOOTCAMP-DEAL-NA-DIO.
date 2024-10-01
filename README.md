
```mermaid

classDiagram
    class Ruan {
        name : string
        account : Account
        features : Feature[ ]
        card : Card
        news : News[ ]
    }
    
    class Account {
        number : string
        agency : string
        balance : float
        limit : float
    }

    class Feature {
        icon : string
        description : string
    }
    
    class Card {
        number : string
        limit : float
    }
    
    class News {
        icon : string
        description : string
    }

    Ruan "1" *-- "1" Account
    Ruan "1" *-- "N" Feature
    Ruan "1" *-- "1" Card
    Ruan "1" *-- "N" News
