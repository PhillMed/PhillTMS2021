package robot;

import robot.price.IPrice;

public abstract class RobotParts implements IPrice {
    private final int price;

    public RobotParts(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}