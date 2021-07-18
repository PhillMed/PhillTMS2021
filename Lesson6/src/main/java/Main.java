import static com.conts.Constants.FEMALE;
import static com.conts.Constants.MALE;

public class Main {
    public static void main(String[] args) {
        MilitaryOffice militaryOffice = new MilitaryOffice();
        Registry registry = new Registry();
        militaryOffice.setRegistry(registry);

        Person[] people = new Person[5];
        people[0] = new Person("Vova", MALE, 13, new Address("Minsk", "RB"));
        people[1] = new Person("Maks", MALE, 19, new Address("Grodno", "RB"));
        people[2] = new Person("Eugene", MALE, 23, new Address("Minsk", "RB"));
        people[3] = new Person("Stas", MALE, 33, new Address("Minsk", "RB"));
        people[4] = new Person("Juli", FEMALE, 24, new Address("Brest", "RB"));

        registry.setPersons(people);
        militaryOffice.getRegistry().getAllSuitablePersons();
        System.out.println();
        militaryOffice.getRegistry().getPersonFromCity("Minsk");
    }
}
