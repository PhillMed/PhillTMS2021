package Robot.Price;

public interface IPrice {
    default int getPrice() {
        return 0;
    }
}