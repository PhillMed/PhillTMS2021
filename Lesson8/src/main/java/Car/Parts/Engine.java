package Car.Parts;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Engine {
    private final String type;
    private final int workVolume;
    public boolean isRunning;

    public Engine(String type, int workVolume) {
        this.type = type;
        this.workVolume = workVolume;
    }
}