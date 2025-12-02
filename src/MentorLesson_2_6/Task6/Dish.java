package MentorLesson_2_6.Task6;

public class Dish {

    private final String name;
    private final String category;
    private double price;
    private final boolean available;

    public Dish(boolean available, double price, String category, String name) {
        this.available = available;
        this.price = price;
        this.category = category;
        this.name = name;
    }


    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
