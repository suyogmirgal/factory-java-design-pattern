public class NotificationFactory {


  public Notification createNotification(String type) {
    if (type.equals("EMAIL")) {

      return new EmailNotification("gmail.com", "suyogm", "suyog@123");

    } else if (type.equals("SMS")) {

      return new SMSNotification("suyogm", "123-xyz");

    } else if (type.equals("PUSH")) {

      return new PushNotification();
    }
    return null;
  }
}
