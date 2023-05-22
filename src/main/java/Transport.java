import lombok.Getter;

@Getter
public abstract class Transport {
    private String typeOfTransport;

    public Transport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }
    public void readyToStart() {
        System.out.println(getTypeOfTransport() + " готов к работе");
    }

    @Override
    public String toString() {
        return  typeOfTransport ;
    }
}
