package Robot.Heads;

import Robot.RobotParts;

public class SamsungHead extends RobotParts implements IHeads {

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }
} 