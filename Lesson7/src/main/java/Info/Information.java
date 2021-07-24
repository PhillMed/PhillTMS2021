package Info;

import com.Transport.Transport;

public interface Information {
    void shoot(Transport transport);

    void catapult(Transport transport);

    void lightInfo(Transport transport, double time);

    void checkWeightCapacity(Transport transport, double weight);

    void checkPassengerCapacity(Transport transport, int people);

    void method(Transport transport, String str);
}