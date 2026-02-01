import java.util.Scanner;

public class HillWeightTask8 {

    public int totalHillWeight(int input1, int input2, int input3) {
        int sum = 0;
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                sum += input2;
            }
            input2 += input3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HillWeightTask8 obj = new HillWeightTask8();

        System.out.println(" Total Hill Weight ");
        System.out.print("Enter number of levels (input1): ");
        int levels = sc.nextInt();
        System.out.print("Enter initial weight per level (input2): ");
        int weight = sc.nextInt();
        System.out.print("Enter incremental weight per level (input3): ");
        int increment = sc.nextInt();

        int total = obj.totalHillWeight(levels, weight, increment);
        System.out.println("Result: Total hill weight is " + total);
    }
}
