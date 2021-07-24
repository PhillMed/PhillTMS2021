package Info;

import com.Transport.Air.Civil.Civil;
import com.Transport.Air.Military.Military;
import com.Transport.Land.Cargo.Cargo;
import com.Transport.Land.Light.Light;
import com.Transport.Transport;

public class InformationService implements Information {

    public void shoot(Transport transport) {
        Military military = (Military) transport;
        int countRockets = military.getCountRockets();
        if (countRockets > 0) {
            System.out.println("Ракета пошла...");
            military.setCountRockets(--countRockets);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult(Transport transport) {
        if (transport instanceof Military military) {
            if (military.isCatapultSystem()) {
                System.out.println("Катапультирование прошло успешно");
                military.setCatapultSystem(false);
            } else {
                System.out.println("У вас нет такой системы");
            }
        } else {
            System.out.println("Ожидаю военный транспорт, а пришел " + transport.getClass());
        }
    }

    @Override
    public void lightInfo(Transport transport, double time) {
        Light light = (com.Transport.Land.Light.Light) transport;
        System.out.println("За время " + time + " ч, автомобиль " + light.getBrand() + " двигаясь с максимальной скоростью " + light.getMaxSpeed() + " км/ч проедет "
                + getWay(light, time) + " км и израсходует " + calculateConsumedFuel(light, time) + " литров топлива.");

    }

    private double calculateConsumedFuel(Light light, double time) {
        return getWay(light, time) * light.getFuelConsumption() / 100;
    }

    private double getWay(Light light, double time) {
        return light.getMaxSpeed() * time;
    }

    @Override
    public void checkWeightCapacity(Transport transport, double weight) {
        Cargo freight = (Cargo) transport;
        if (weight <= freight.getCarryingCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public void checkPassengerCapacity(Transport transport, int people) {
        Civil civil = (Civil) transport;
        if (people <= civil.getCountPassengers()) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    @Override
    public void method(Transport transport, String str) {
        System.out.println(transport.getWeight() + str);
    }
}