public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("Hi, this is my notification", "");

        notification.NotifyUser();
    }
}
