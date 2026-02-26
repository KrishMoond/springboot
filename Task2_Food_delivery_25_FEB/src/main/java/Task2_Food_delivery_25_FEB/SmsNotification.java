package Task2_Food_delivery_25_FEB;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SmsNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}