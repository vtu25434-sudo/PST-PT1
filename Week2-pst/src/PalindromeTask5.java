import java.util.Scanner;

public class PalindromeTask5 {

    public int isPalindrome(String input1) {
        int left = 0;
        int right = input1.length() - 1;
        input1 = input1.toLowerCase();

        while (left < right) {
            if (input1.charAt(left) != input1.charAt(right)) {
                return 1; 
            }
            left++;
            right--;
        }
        return 2; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeTask5 obj = new PalindromeTask5();

        System.out.println("Check if String is Palindrome");
        System.out.print("Enter a string: ");
        String str = sc.next();

        int result = obj.isPalindrome(str);
        if (result == 2) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
