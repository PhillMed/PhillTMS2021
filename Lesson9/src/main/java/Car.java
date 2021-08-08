import java.util.Random;

public class Car implements Startable {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void start() throws Exception {
        Random random = new Random();
        int nextInt = random.nextInt(21);
        if (brand != null || speed != 0 || price != 0) {
//            if (price == -1) {
//              throw new Exception("данные не корректные price <0");
//            }
            if (nextInt % 2 == 0) {
                System.out.println("Машина " + brand + " завелась!");
            } else {
                throw new CarIsNotStart("Машина " + brand + " не завелась!");
            }
        } else {
            throw new IllegalArgumentException("данные не корректные");
        }
    }
}