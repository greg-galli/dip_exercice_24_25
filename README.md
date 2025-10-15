
### Système de notification

Vous devez développer un système de notification pour une application. Le système doit permettre d'envoyer des notifications via différents canaux comme l'e-mail, les SMS, ou encore les notifications push. Cependant, le système doit être conçu de manière à respecter le **principe d'inversion de dépendances (DIP)**, afin que les classes de haut niveau ne dépendent pas directement des classes de bas niveau. Elles doivent plutôt dépendre d'abstractions.

Le but de cet exercice est de mettre en œuvre le **principe d'inversion de dépendances** (DIP), où :

- Les classes de haut niveau (par exemple, la classe `NotificationService` qui envoie les notifications) ne dépendent pas directement des classes concrètes d'envoi de messages comme `EmailSender` ou  `SMSSender`.
-  Au lieu de cela, elles dépendent d'une **abstraction** (interface) pour envoyer des messages, permettant ainsi de changer facilement les canaux de notification sans modifier le service principal.

### Instructions :

Refactorisez le code de ce projet pour respecter le **principe d'inversion de dépendances**.
