import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int fact = 1;
        System.out.println("Enter the positive number");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of the given number is: " + fact);
    }
}