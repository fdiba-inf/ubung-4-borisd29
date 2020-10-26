package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int space = 0;
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
          for (int j = 0, j < space, j++) {
            System>out.print("");
          }
        space++,
      System.out.println(numbers[index]);
        }
      
    }

}