public class Main {
    public static void main(String[] args) {

        Startable carBmw = new Car("бмв", 220, 23000);
        Startable car2 = new Car("мерс", 220, 23000);
        Startable car3 = new Car("жигули", 120, 1500);
        Car car4 = new Car();
        car4.setPrice(80000);
        car4.setBrand("феррари");
        Startable[] startables = {carBmw, car2, car3, car4};

        try {
            method(startables);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause() != null ? exception.getCause().getMessage() : "");
            exception.printStackTrace();
        }
    }

    static void method(Startable[] startables) throws Exception {
        for (Startable startable : startables) {
            try {
                startable.start();//отловим
//            } catch (CarIsNotStart exception) {
//                throw exception;
            } catch (Exception exception2) {
                System.out.println(exception2.getMessage());
//            } catch (Exception e) {
//                System.out.println("2 " + e.getMessage());
            }
        }
    }
}