import java.util.Scanner;

public class CountDigitTask6 {

    public int allDigitsCount(int input1) {
        int count = 0;
        while (input1 > 0) {
            count++;
            input1 /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountDigitTask6 obj = new CountDigitTask6();

        System.out.println("Count Digits of a Number");
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int digits = obj.allDigitsCount(num);
        System.out.println("Result: The number of digits is " + digits);
    }
}
