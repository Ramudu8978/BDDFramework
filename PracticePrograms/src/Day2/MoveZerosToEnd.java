package Day2;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 1, 0, 5, 0, 9};

        int index = 0; // Position to place the next non-zero element

        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Second pass: Fill the rest with zeros
        while (index < arr. length) {
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    } 
}