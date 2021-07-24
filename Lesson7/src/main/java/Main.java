import Info.Information;
import Info.InformationService;
import com.Transport.Air.Civil.Civil;
import com.Transport.Air.Military.Military;
import com.Transport.Land.Cargo.Cargo;
import com.Transport.Land.Light.Light;
import com.Transport.Transport;

public class Main {

    public static void main(String[] args) {
        Transport light = Light.builder()
                .power(100)
                .maxSpeed(150)
                .weight(2)
                .brand("Nissan")
                .wheels(4)
                .fuelConsumption(10)
                .bodyType("Sedan")
                .countPassengers(5)
                .build();

        Transport cargo = Cargo.builder()
                .power(200)
                .maxSpeed(140)
                .weight(4)
                .brand("Камаз")
                .wheels(6)
                .fuelConsumption(20)
                .carryingCapacity(1000)
                .build();

        Transport civil = Civil.builder()
                .power(1000)
                .maxSpeed(500)
                .weight(10)
                .brand("Boing")
                .wingspan(10)
                .minRunwayLength(15)
                .countPassengers(180)
                .businessClass(true)
                .build();

        Transport military = Military.builder()
                .power(1500)
                .maxSpeed(750)
                .weight(7)
                .brand("Cy")
                .wingspan(6)
                .minRunwayLength(5)
                .catapultSystem(true)
                .countRockets(9) // Как брать значение отсюда ****
                .build();

        System.out.println(light);
        System.out.println(cargo);
        System.out.println(civil);
        System.out.println(military + "\n");

        Information informationService = new InformationService();

        informationService.catapult(light);

        for (int i = 0; i < 10; i++) { // чтобы вставить вместо "10"? ****
            informationService.shoot(military);
        }

        informationService.catapult(military);
        informationService.lightInfo(light, 7.2);
        informationService.checkWeightCapacity(cargo, 900);
        informationService.checkPassengerCapacity(civil, 20000);
        informationService.method(civil, "т весит данный самолёт");

    }
}