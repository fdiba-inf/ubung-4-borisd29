package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char [] a = new char[count];
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            a[index] = input.next().charAt(0);
            if (numbers[index]<numbers[min]) {
                min = index;
            }
        }
        System.out.println("Min index: " + min);
    }

}