package MentorLesson_2_5;

import java.util.Objects;

public class Car {
    private int plateNumber;
    private String model;

    public Car(int plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return plateNumber == car.plateNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, model);
    }

    @Override
    public String toString() {
        return
                "10-AA-" + plateNumber +
                "|" + model ;
    }
}
