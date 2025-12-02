package MentorLesson_2_6.Task6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Dish> dishes = List.of(
                new Dish(false, 12.99, "Dessert", "Cheesecake"),
                new Dish(true, 10.99, "Dessert", "Baklava"),
                new Dish(true, 7.99, "Dessert", "ApplePie"),

                new Dish(true, 18.99, "Main", "Kebab"),
                new Dish(true, 19.99, "Main", "Fish"),
                new Dish(false, 19.99, "Main", "Grilled Chicken"),

                new Dish(true, 8.59, "Salad", "Ceasar Salad"),
                new Dish(false, 59.99, "Salad", "Chef's Special Salad")

        );

        dishes.stream()
                .filter(n -> !n.isAvailable())
                .forEach(n -> System.out.println("Sorry not available! " + n.getName()));


        double mainTotal = dishes.stream()
                .filter(n -> n.getCategory().equalsIgnoreCase("Main"))
                .mapToDouble(Dish::getPrice)
                .sum();
        System.out.println(mainTotal);


        Map<String, List<Dish>> byCategories = dishes.stream()
                .collect(Collectors.groupingBy(Dish::getCategory));

        System.out.println(byCategories);

        Map<String, Double> avgByCategory = dishes.stream()
                .collect(Collectors.groupingBy(
                        Dish::getCategory,
                        Collectors.averagingDouble(Dish::getPrice)
                ));

        System.out.println(avgByCategory);


        Dish mostExpensive = dishes.stream()
                .max(Comparator.comparingDouble(Dish::getPrice))
                .orElse(null);

        System.out.println(mostExpensive);


    }
}
