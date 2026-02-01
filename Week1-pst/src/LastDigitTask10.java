import java.util.*;

public class LastDigitTask10 {

    static int sumOfLastDigits(int a, int b) {
        int lastDigit1 = Math.abs(a % 10);
        int lastDigit2 = Math.abs(b % 10);
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = sumOfLastDigits(a, b);
        System.out.println("Sum of last digits: " + result);
    }
}
