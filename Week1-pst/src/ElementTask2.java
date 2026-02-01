import java.util.Scanner; 
public class ElementTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size:");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the index number:");
        int index = sc.nextInt();

        if (index >= 0 && index < n) {
            System.out.println("Index valid, element is: " + A[index]);
        } else {
            System.out.println("Index invalid");
        }
    }
	}
