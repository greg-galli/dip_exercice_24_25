
### Système de notification

Vous devez développer un système de notification pour une application. Le système doit permettre d'envoyer des notifications via différents canaux comme l'e-mail, les SMS, ou encore les notifications push. Cependant, le système doit être conçu de manière à respecter le **principe d'inversion de dépendances (DIP)**, afin que les classes de haut niveau ne dépendent pas directement des classes de bas niveau. Elles doivent plutôt dépendre d'abstractions.

Le but de cet exercice est de mettre en œuvre le **principe d'inversion de dépendances** (DIP), où :

- Les classes de haut niveau (par exemple, la classe `NotificationService` qui envoie les notifications) ne dépendent pas directement des classes concrètes d'envoi de messages comme `EmailSender` ou  `SMSSender`.
-  Au lieu de cela, elles dépendent d'une **abstraction** (interface) pour envoyer des messages, permettant ainsi de changer facilement les canaux de notification sans modifier le service principal.

----------

### Contraintes :

1.  **Classe de haut niveau** : La classe `NotificationService` doit gérer l'envoi des notifications, mais elle ne doit pas dépendre directement des implémentations concrètes des canaux de notification (comme `EmailSender` ou `SMSSender`).

2.  **Interfaces** : Créez une interface `MessageSender` qui définira la méthode `sendMessage()` pour envoyer un message, et les classes `EmailSender`, `SMSSender` et `PushNotificationSender` devront implémenter cette interface.

3.  **Injection de dépendances** : Utilisez l'injection de dépendances (via le constructeur ou un setter) pour permettre à `NotificationService` de dépendre d'une abstraction (`MessageSender`) plutôt que des implémentations concrètes.

4.  **Scénario d'utilisation** : Le système doit permettre d'envoyer des notifications via différents canaux sans modifier le code de la classe `NotificationService`.


----------

### Instructions :

Refactorisez le code de ce projet pour respecter le **principe d'inversion de dépendances**.