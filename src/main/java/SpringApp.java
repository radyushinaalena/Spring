import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Transport transport = context.getBean("car", Transport.class);
        Transport transport2 = context.getBean("bus", Transport.class);
        Transport transport3 = context.getBean("pickup", Transport.class);
        transport.readyToStart();
        transport2.readyToStart();
        transport3.readyToStart();

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver1.start();
        driver2.start();
        driver3.start();
    }
}