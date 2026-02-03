public class AddSubTask10 {


    // Method as required by the question
    public int AddSub(int input1, int input2) {

        int N = input1;
        int opt = input2;
        int result = 0;

        for (int i = N; i >= 1; i--) {

            int position = N - i + 1; // term position

            if (opt == 1) {
                // Pattern: + - + - ...
                if (position % 2 == 1)
                    result += i;
                else
                    result -= i;
            } else {
                // Pattern: + + - + - ...
                if (position == 1 || position % 2 == 0)
                    result += i;
                else
                    result -= i;
            }
        }

        return result;
    }

    // MAIN METHOD for VS Code execution
    public static void main(String[] args) {

        AddSubTask10 obj = new AddSubTask10();
        int N = 6;
        int opt1 = 1;
        int opt2 = 2;

        System.out.println("Result (opt=1): " + obj.AddSub(N, opt1));
        System.out.println("Result (opt=2): " + obj.AddSub(N, opt2));
    }
}
    