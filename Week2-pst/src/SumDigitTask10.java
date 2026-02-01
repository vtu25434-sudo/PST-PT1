import java.util.Scanner;

public class SumDigitTask10 {

    public int sumOfsumOfDigits(int input1) {
        String num = String.valueOf(input1);
        int totalSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentSum = 0;
            for (int j = i; j < num.length(); j++) {
                currentSum += num.charAt(j) - '0';
            }
            totalSum += currentSum;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumDigitTask10 obj = new SumDigitTask10();

        System.out.println("Sum of Sum of Digits");
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int result = obj.sumOfsumOfDigits(num);
        System.out.println("Result: Sum of sum of digits is " + result);
    }
}
