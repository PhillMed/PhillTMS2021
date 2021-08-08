package Robot.Heads;

import Robot.RobotParts;

public class ToshibaHead extends RobotParts implements IHeads {

    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }
}