package robot.legs;

import robot.price.IPrice;

public interface ILeg extends IPrice {
    void step();
}