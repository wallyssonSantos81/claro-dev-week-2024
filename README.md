# Projeto Claro Dev 2024
java RESTful API criado para a Claro Dev Week.

## Diagrama de Classe

````mermaid

classDiagram
    class User {
        +String name
        +Account account
        +Feature[] feature
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *--> "1" Account 
    User "1" *--> "N" Feature 
    User "1" *--> "1" Card 
    User "1" *--> "N" News 





