public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyByEmail("Envoi d'email");
        notificationService.notifyBySMS("Envoi de SMS");
    }
}
