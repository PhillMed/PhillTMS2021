package Car.Parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tank {
    private final int volume;
    public int fuelLevel;

    public Tank(int volume) {
        this.volume = volume;
    }
}
