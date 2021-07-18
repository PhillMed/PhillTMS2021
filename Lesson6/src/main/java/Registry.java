import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Registry {
    private Person[] persons;

    public void getAllSuitablePersons() {
        for (Person p : this.persons) {
            if (p.getAge() >= 18 && p.getAge() < 27) {
                System.out.println(p);
            }
        }
    }
    public void getPersonFromCity(String city) {
        for (Person p : this.persons) {
            if (p.getAddress().getCity().equals(city) && p.getAge() >= 18 && p.getAge() < 27) {
                System.out.println(p);
            }
        }
    }

}
