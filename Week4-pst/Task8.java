import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

    
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        
        if (n == 0 || k == 0) {
            System.out.println("[]");
            sc.close();
            
        }

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }


            deque.offerLast(i);

        
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        
        System.out.println("Maximum elements in each sliding window:");
        System.out.println(result);

        sc.close();
    }
}
