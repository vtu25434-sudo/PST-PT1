import java.util.*;

public class DigitSumTask7 {

    static int digitSum(int num, int opt) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (opt == 1 && digit % 2 != 0) {     
                sum += digit;
            } 
            else if (opt == 2 && digit % 2 == 0) { 
                sum += digit;
            }

            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter option (1-odd, 2-even): ");
        int opt = sc.nextInt();

        int result = digitSum(num, opt);
        System.out.println("Result: " + result);
    }
}
