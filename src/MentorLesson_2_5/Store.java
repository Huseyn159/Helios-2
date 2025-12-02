package MentorLesson_2_5;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {

        Product phone = new Product("Iphone",899.99);
        Product phone1 = new Product("Iphone",8799.99);
        Product laptop = new Product("HP",999.99);
        Product mouse = new Product("Logitech",129.99);


        Map<Product,Integer> map = new HashMap<>();

        map.put(phone,50);
        map.put(laptop,120);
        map.put(mouse,0);
        map.put(phone1,20);


        map.forEach((k,v) -> System.out.println("Product:   " + k + " Stock:  " + v));

    }
}
