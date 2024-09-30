class NotificationService {
    private EmailSender emailSender = new EmailSender();
    private SMSSender smsSender = new SMSSender();

    public void notifyByEmail(String message) {
        emailSender.sendEmail(message);
    }

    public void notifyBySMS(String message) {
        smsSender.sendSMS(message);
    }
}