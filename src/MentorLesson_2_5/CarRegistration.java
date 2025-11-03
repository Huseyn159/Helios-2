package MentorLesson_2_5;

import java.util.HashMap;
import java.util.Map;

public class CarRegistration {
    public static void main(String[] args) {

        Car car1 = new Car(100,"Mercedes");
        Car car2 = new Car(102,"BMW");
        Car car3 = new Car(565,"Lada");



        Owner o1 = new Owner("Vilayet");
        Owner o2 = new Owner("Elnur");
        Owner o3 = new Owner("Ehmed");

        Map<Car,Owner> map = new HashMap<>();

        map.put(car1,o1);
        map.put(car2,o2);
        map.put(car3,o3);

        map.forEach((k,v)-> System.out.println("Car -> " + k + " -> Owner -> " + v));


    }
}
