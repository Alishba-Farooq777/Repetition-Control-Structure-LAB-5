import java.util.Scanner;

public class GradedTask51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part (a)
        System.out.println("Part (a): Enter A and B (A <= B):");
        int a = input.nextInt();
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Part (b)
        System.out.println("Part (b): Enter A and B:");
        a = input.nextInt();
        b = input.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Part (c)
        System.out.println("Part (c): Enter N (how many numbers):");
        int n = input.nextInt();
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum is: " + sum);

        // Part (d)
        System.out.println("Part (d): Enter N to find sum of cubes:");
        n = input.nextInt();
        int cubeSum = 0;

        for (int i = 1; i <= n; i++) {
            cubeSum = cubeSum + (i * i * i);
        }
        System.out.println("Sum of cubes is: " + cubeSum);
    }
}
