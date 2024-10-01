
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

    Ruan --> Account
    Ruan --> Feature
    Ruan --> Card
    Ruan --> News
