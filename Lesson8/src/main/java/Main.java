import Car.Car;
import Car.Parts.Engine;
import Car.Parts.Tank;
import Car.Service.CarService;
import Car.Service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(60000);
        Engine engine = new Engine("gasoline", 3000);
        Car car = new Car(engine);
        car.setTank(tank);


        car.setMaxSpeed(250);

        CarService carService = new CarServiceImpl(car, tank);

        carService.start();
        carService.startEngine();
        carService.refueling();
        carService.startEngine();
        carService.start();
        carService.stop();
        carService.stopEngine();
        carService.startEngine();
        carService.start();
        carService.go();
        carService.allTime();
        car.setSpeed(200);
        carService.speedUp();
        carService.speedUp();
        carService.speedUp();
        carService.speedUp();
        carService.totalSpeed();
        carService.speedDown();
        carService.totalSpeed();
        carService.allTime();
        carService.go();
        carService.refueling();
        carService.go();
        carService.refueling();
        carService.go();
        carService.refueling();
        carService.go();
        carService.allTime();
        carService.totalDistance();
        carService.whatAboutFuel();
    }
}
