package Lectures.BasicSybtax;

public class TheatrePromotions {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        double price = -1; // Initialize price with an invalid value

        if (day.equals("weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (day.equals("weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        } else if (day.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        } else {
            System.out.println("Error!");
            return; // Exit the program early if an invalid day is entered
        }

        if (price == -1) {
            System.out.println("Error!"); // Handle invalid ages
        } else {
            System.out.printf("%.0f$%n", price);
        }
    }
}
