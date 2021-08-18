package robot.price;

public interface IPrice {
    default int getPrice() {
        return 0;
    }
}