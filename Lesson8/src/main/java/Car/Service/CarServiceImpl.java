package Car.Service;

import Car.Car;
import Car.Parts.Tank;

public class CarServiceImpl implements CarService {
    private final Car car;
    private final EngineService engineService;
    private final FuelService fuelService;
    private final Tank tank;

    public CarServiceImpl(Car car, Tank tank) {
        this.car = car;
        this.engineService = new EngineServiceImpl(car.getEngine());
        this.fuelService = new FuelServiceImpl(car.getTank());
        this.tank = tank;
    }

    @Override
    public boolean isMoving() {
        return car.isMoving();
    }


    @Override
    public void refueling() {
        fuelService.refuel();
    }

    @Override
    public void start() {
        if (engineService.isRunning()) {
            car.setMoving(true);
            System.out.println("Автомобиль поехал");
            car.setSpeed(30);
        } else {
            System.out.println("Заведите двигатель");
        }
    }

    @Override
    public void stop() {
        if (isMoving()) {
            car.setMoving(false);
            car.setSpeed(0);
            System.out.println("Автомобиль остановился");
        }
    }

    @Override
    public void startEngine() {
        if (!engineService.isRunning() && !fuelService.isEmpty()) {
            engineService.start();
        } else if (engineService.isRunning()) {
            System.out.println("Двигатель уже запущен");
        } else if (fuelService.isEmpty()) {
            System.out.println("Заправьте автомобиль");
        }
    }

    @Override
    public void stopEngine() {
        if (engineService.isRunning() && !isMoving()) {
            engineService.stop();
        } else if (!engineService.isRunning()) {
            System.out.println("Двигатель не заведён");
        } else if (isMoving()) {
            System.out.println("Сначала остановите автомобиль");
        }
    }

    @Override
    public void distanceCovered() {
        if (isMoving()) {
            car.setDistance(car.getDistance() + 100);
        }
    }


    @Override
    public void totalSpeed() {
        System.out.println("Итоговая скорость: " + car.getSpeed() + "км/ч");

    }

    @Override
    public void wasteOfFuel() {
        tank.setFuelLevel(tank.getFuelLevel() - (car.getSpeed() * car.getSpeed()));
    }

    @Override
    public void whatAboutFuel() {
        System.out.println("Количество бензина: " + tank.getFuelLevel() + "мл");
    }

    @Override
    public void speedUp() {
        if (car.getMaxSpeed() > car.getSpeed()) {
            car.setSpeed(car.getSpeed() + 25);
            System.out.println("Скорость увеличена на 25км/ч");
        } else {
            System.out.println("Достигнута максимальная скорость");
        }
    }

    @Override
    public void speedDown() {
        if (car.getSpeed() <= 10) {
            System.out.println("Скорость и так ниже некуда!");
        } else {
            car.setSpeed(car.getSpeed() - 10);
            System.out.println("Скорость уменьшена на 10км/ч");
        }
    }

    @Override
    public void totalDistance() {
        System.out.println(car.getDistance());
    }

    @Override
    public void timeOfTravel() {
        car.setTime(car.getTime() + (double) (car.getDistance() / car.getSpeed()));
    }

    @Override
    public void allTime() {
        System.out.println("Всего в пути: " + car.getTime() + "ч.");
    }

    @Override
    public void go() {
        if (tank.getFuelLevel() >= (car.getSpeed() * 15)) {
            wasteOfFuel();
            distanceCovered();
            timeOfTravel();
        } else {
            System.out.println("Нужно заправить бак, иначе может не хватить!");
        }
    }
}
