package Lectures.BasicSybtax;

public class EvenNumber {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());

            while (num % 2 != 0){
                System.out.println("Please write an even number.");

                num = Integer.parseInt(scanner.nextLine());
            }
            System.out.printf("The number is: %d", Math.abs(num));
        }
    }

