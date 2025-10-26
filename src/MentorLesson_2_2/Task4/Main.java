package MentorLesson_2_2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> nums = new ArrayList<>();

        PaymentProcessor processor = new PaymentProcessor();

        processor.addPayments(nums);
        System.out.println(nums);


    }
}
