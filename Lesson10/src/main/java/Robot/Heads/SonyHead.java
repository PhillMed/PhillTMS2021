package Robot.Heads;

import Robot.RobotParts;

public class SonyHead extends RobotParts implements IHeads {

    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }
}