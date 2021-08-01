import Car.Car;
import Car.Parts.Engine;
import Car.Parts.Tank;
import Car.Service.CarService;
import Car.Service.CarServiceImpl;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(60);
        Engine engine = new Engine("gasoline", 3000);
        Car car1 = new Car(engine);
        car1.setTank(tank);

        CarService carService = new CarServiceImpl(car1);

        carService.go();
        carService.startEngine();
        carService.refueling();
        carService.startEngine();
        carService.go();
        carService.stop();
        carService.stopEngine();
    }
}
