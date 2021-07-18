import com.conts.Constants;
import com.conts.Sex;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Registry {
    private Person[] persons;

    public void getAllSuitablePersons() {
        for (Person p : persons) {
            if (p.getSex().equals(Sex.MALE) && p.getAge() >= Constants.MIN_AGE && p.getAge() < Constants.MAX_AGE) {
                System.out.println(p);
            }
        }
    }
    public void getPersonFromCity(String city) {
        for (Person p : persons) {
            if (p.getSex().equals(Sex.MALE) && p.getAddress().getCity().equals(city) && p.getAge() >= 18 && p.getAge() < 27) {
                System.out.println(p);
            }
        }
    }
}
