public class EmailNotification implements Notification {

  public EmailNotification(String host, String userName, String password) {
    //Email server

  }

  @Override
  public void notifyUser(NotificationDetails notificationDetails) {

    System.out.println("sending email to user ");

  }
}
