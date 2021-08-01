package Car.Service;

import Car.Parts.Tank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class FuelServiceImpl implements FuelService {
    private final Tank tank;

    @Override
    public boolean isEmpty() {
        return tank.getFuelLevel() == 0;
    }

    @Override
    public void refuel() {
        tank.setFuelLevel(tank.getVolume());
    }
}
