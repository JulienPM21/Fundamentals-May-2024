package Lectures.BasicSybtax;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

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

