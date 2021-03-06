import java.util.Scanner;

import static java.lang.Math.pow;

public class SquareRoot {


    public static double squareRoot(int number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Square root of " + num + " is: " + squareRoot(num));
    }

}