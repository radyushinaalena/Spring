import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("легковой автомобиль");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver(getCarBean(), "Михаил");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("автобус");
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver(getBusBean(), "Александр");
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("пикап");
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver(getPickupBean(), "Максим");
    }
}