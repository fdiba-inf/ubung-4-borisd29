package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        int min = 0;
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
            if (numbers[index]<numbers[min]) {
                min = index;
            }
        }
        System.out.println("Min index: " + min);
    }

}