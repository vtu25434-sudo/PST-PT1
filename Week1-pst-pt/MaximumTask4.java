
public class MaximumTask4 {

	public static void main(String[] args) {
		int[] arr={9,7,4,5,6};
		int max=arr[0];
		int i;
		for(i=1;i<=4;i++){
		if(max<arr[i]){
		max=arr[i];
		}
		}
		System.out.println("Maximum element is:" +max) ;
		}
		
	}


