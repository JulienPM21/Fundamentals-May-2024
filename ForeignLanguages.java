package Lectures.BasicSyntax;

import java.util.Scanner;

        public class ForeignLanguages {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        switch (country) {
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
                break;
            case "USA":
            case "England":
                System.out.println("English");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
