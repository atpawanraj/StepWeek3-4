import java.util.Scanner;

public class LEVEL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Q1 Odd and Even Numbers");

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        // Q2
        System.out.println("\nQ2 Employee Bonus");

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is " + bonus);

        sc.close();
    }
}
