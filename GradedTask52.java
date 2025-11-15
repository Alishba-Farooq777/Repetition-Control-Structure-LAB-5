import java.util.Scanner;

public class GradedTask52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to find its factorial:");
        int n = input.nextInt();
        
        long fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
