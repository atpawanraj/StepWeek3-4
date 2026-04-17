import java.util.Scanner;

public class LEVEL1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Q1 Divisible by 5");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean divisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        // Q2
        System.out.println("\nQ2 First Number Smallest");

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        boolean smallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + smallest);

        // Q3
        System.out.println("\nQ3 Largest Number Check");

        boolean firstLargest = (number1 > number2 && number1 > number3);
        boolean secondLargest = (number2 > number1 && number2 > number3);
        boolean thirdLargest = (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        sc.close();
    }
}