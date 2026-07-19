package NotificationSystem;

public class SmartNotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification("Shristi", "Welcome to our platform!");
        notifications[1] = new SMSNotification("Rahul", "Your OTP is 4589.");
        notifications[2] = new PushNotification("Priya", "You have a new message.");

        System.out.println("----- Sent Notifications -----");

        for (Notification n : notifications) {
            n.sendNotification();
            System.out.println();
        }
    }
}