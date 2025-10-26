package MentorLesson_2_2.Task1;

public class Task1 {
    public static void main(String[] args) {
        Storage<Phone> phoneStorage = new Storage<>();
        phoneStorage.store(new Phone("Iphone 15",256));
        Storage<Food> foodStorage = new Storage<>();
        foodStorage.store(new Food("burger"));

        phoneStorage.retrieve();

    }
}
