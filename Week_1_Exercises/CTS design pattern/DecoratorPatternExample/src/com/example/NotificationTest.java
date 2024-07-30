package com.example;

public class NotificationTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("First Notification");

        System.out.println("-- Adding sms Notification --");
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("Updated Notification with SMS");

        System.out.println("-- Adding slack Notification --");
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("Updated Notification with SMS and Slack");
    }
}

