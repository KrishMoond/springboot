package Task2_Food_delivery_25_FEB;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodAppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FoodAppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        context.close();
    }
}