package arithmeticOperators;

import java.util.Scanner;

public class arithmeticOperators {
    public static void main(String[] args) {
        int a,b, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a and b: ");
        // take two values from user
        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a + b; // arithmetic addition of a and b
        System.out.println("Result after addition: " + result);

        result = a - b; // arithmetic subtraction of a and b
        System.out.println("Result after subtraction : " + result);

        result = a * b; // arithmetic multiplication of a and b
        System.out.println("Result after multiplication: " + result);

    }







}
