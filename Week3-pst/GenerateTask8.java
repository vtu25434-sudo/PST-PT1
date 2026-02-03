public class GenerateTask8 {

    public static int seriesN(int input1, int input2, int input3, int input4) {

        int a = input1;
        int b = input2;
        int c = input3;
        int N = input4;

        int d1 = b - a;
        int d2 = c - b;

        int term = a;

        if (N == 1) {
            return a;
        }

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                term = term + d1;
            } else {
                term = term + d2;
            }
        }

        return term;
    }

    // MAIN METHOD for execution
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 6;
        int N = 17;

        int result = seriesN(a, b, c, N);
        System.out.println("Nth term is: " + result);
    }
}