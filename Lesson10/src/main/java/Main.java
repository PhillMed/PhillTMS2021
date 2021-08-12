import Robot.Hands.IHand;
import Robot.Hands.SamsungHand;
import Robot.Hands.SonyHand;
import Robot.Hands.ToshibaHand;
import Robot.Heads.IHeads;
import Robot.Heads.SamsungHead;
import Robot.Heads.SonyHead;
import Robot.Heads.ToshibaHead;
import Robot.IRobot;
import Robot.Legs.ILeg;
import Robot.Legs.SamsungLeg;
import Robot.Legs.SonyLeg;
import Robot.Legs.ToshibaLeg;
import Robot.Robot;

public class Main {
    public static void main(String[] args) {
        IHeads[] heads = new IHeads[3];
        heads[0] = new SamsungHead(5300);
        heads[1] = new SonyHead(5680);
        heads[2] = new ToshibaHead(4900);
        IHand[] hands = new IHand[3];
        hands[0] = new ToshibaHand(3200);
        hands[1] = new SamsungHand(4050);
        hands[2] = new SonyHand(3600);
        ILeg[] legs = new ILeg[3];
        legs[0] = new SonyLeg(4300);
        legs[1] = new SamsungLeg(4000);
        legs[2] = new ToshibaLeg(3760);

        IRobot[] robots = new IRobot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        for (int i = 0; i < 3; i++) {
            robots[i] = new Robot(heads[i], hands[i], legs[i]);
            robots[i].action();
            System.out.println();
            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = i;
                maxPrice = price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.printf("Самый дорогой робот стоит %d у.е. и состоит из головы %s, рук %s и ног %s \n", maxPrice, maxPriceRobot.getHead().getClass().getSimpleName(),
                maxPriceRobot.getHand().getClass().getSimpleName(), maxPriceRobot.getLeg().getClass().getSimpleName());
    }
}