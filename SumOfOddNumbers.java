package Lectures.BasicSybtax;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOddNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= numberOfOddNumbers; i++) {
            int oddNumber = 2 * i -1;
            sum += oddNumber;
            System.out.println(oddNumber);

        }
        System.out.printf("Sum: %d", sum);
    }
}
