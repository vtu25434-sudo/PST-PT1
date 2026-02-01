import java.util.*;

public class EvenTask1 {

    public int isEven(int input1) {
        if (input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenTask1 obj = new EvenTask1();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = obj.isEven(n);
        System.out.println("Result: " + result);
    }
}
