public class NotificationService {

  public static void main(String arg[]) {

    NotificationDetails notificationDetails = new NotificationDetails("Suyog", "Hello !!");

    Notification notification = null;
    notification.notifyUser(notificationDetails);
  }
}
