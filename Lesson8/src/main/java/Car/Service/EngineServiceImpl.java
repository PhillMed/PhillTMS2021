package Car.Service;

import Car.Parts.Engine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EngineServiceImpl implements EngineService {
    private final Engine engine;
    @Override
    public boolean isRunning() {
        return engine.isRunning;
    }

    @Override
    public void start() {
        if (!isRunning()) {
            this.engine.setRunning(true);
            System.out.println("Двигатель запустился");
        } else {
            System.out.println("Двигатель уже работает");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            this.engine.setRunning(false);
            System.out.println("Двигатель заглушён");
        } else {
            System.out.println("Двигатель уже не работает");
        }
    }
}
