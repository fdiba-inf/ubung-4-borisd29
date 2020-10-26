package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[3];
        double max = 0;
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
            if (numbers[index]>max) {
                max = numbers[index];
            }
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Max number: " + max);
    }

}