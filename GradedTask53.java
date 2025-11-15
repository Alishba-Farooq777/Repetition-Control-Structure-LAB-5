import java.util.Scanner;

public class GradedTask53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
