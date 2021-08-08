package Car;

import Car.Parts.Engine;
import Car.Parts.Tank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private final Engine engine;
    private Tank tank;
    private boolean isMoving;
    private int distance;
    private int speed;
    private int maxSpeed;
    private int wasteOfFuel;
    private double time;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
