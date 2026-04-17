import java.util.Scanner;

public class LEVEL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Q1 Armstrong Number Check");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        // Q2
        System.out.println("\nQ2 Count Number of Digits");

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}