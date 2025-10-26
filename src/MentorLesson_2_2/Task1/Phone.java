package MentorLesson_2_2.Task1;

public class Phone {

    String model;
    int capacity;

    public Phone(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
