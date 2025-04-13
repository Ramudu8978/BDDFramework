package Day2;

import java.util.ArrayList;
import java.util.List;

public class SeperateEachDigitList {
	public static void main(String[] args) {
        int number = 12345;
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(0, number % 10); // Extract the last digit and insert at the beginning
            number /= 10; // Remove the last digit
        }

        System.out.println(digits); // Output: [1, 2, 3, 4, 5]
    }
}
