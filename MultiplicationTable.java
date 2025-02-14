package Lectures.BasicSybtax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = 1;

        if (multiplier <= 10) {
            while (multiplier <= 10) {
                System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
                multiplier++;
            }
        }else {
            System.out.printf("%d X %d = %d%n", number , multiplier , number * multiplier);
        }
    }
}
