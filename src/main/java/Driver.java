import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Driver {
    private Transport transport;
    private String name;

    public Driver(Transport transport, String name) {
        this.transport = transport;
        this.name = name;
    }

    public void start() {
        System.out.println(name + " готов к поездке!");
    }

    @Override
    public String toString() {
        return name;
    }
}
