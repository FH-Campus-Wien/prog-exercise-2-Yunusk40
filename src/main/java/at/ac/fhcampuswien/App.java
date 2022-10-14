package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double a;
        double b = 0;
        int c = 1;

        do {
            System.out.print("Number " + c + ": ");
            a = sc.nextDouble();

            if (a < 0 && c == 1) {
                System.out.println("No number entered.");
                return;
            } else if (a > b) {
                b = a;
            }

            c++;
        } while (1 < a);
        System.out.printf("The largest number is %.2f",b);
        System.out.println();
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int y = 1;
        System.out.print("n: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Invalid number!");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i >= j) {
                    System.out.print(y + " ");
                    y++;
                }
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x = 6;

        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        if (h % 2 == 0) {
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }
        for (int i = 1; i < h / 2 + 2; i++) {
            for (int j = 0; j < h / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                char x = (char) (c + 1 - k);
                System.out.print(x);
            }
            for (int a = 2; a <= i; a++) {
                char y = (char) (c + 1 - a);
                System.out.print(y);
            }
            System.out.println();
        }
        for (int i = 0; i < h / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= h / 2 - 1; k++) {
                char x = (char) ((c - h / 2 + 1) + k);
                System.out.print(x);
            }
            for (int k = i; k <= h / 2 - 2; k++) {
                char y = (char) (c - 1 - k);
                System.out.print(y);
            }
            System.out.println();
        }

    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        float sum = 0;
        int c = 1;

        do {
            System.out.print("Mark " + c + ": ");
            x = sc.nextInt();

            if (x < 0 || x > 5) {
                System.out.println("Invalid mark!");
            }
            if (x == 5) {
                y++;
            }
            if (x <= 5 && x >= 1) {
                c++;
                sum += x;
            }
        } while (x > 0);
        double d = sum / (c - 1);
        if (Double.isNaN(d)) {
            d = 0;
        }
        System.out.printf("Average: %.2f", d);
        System.out.println();
        System.out.println("Negative marks: " + y);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int number = sc.nextInt();
        int digit;
        int sum = 0;

        while (number !=1 && number != 4) {
            while (number > 0) {
                digit = number % 10;
                sum = (digit * digit) + sum;
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    //Math.abs() liefert integer zurück
    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}