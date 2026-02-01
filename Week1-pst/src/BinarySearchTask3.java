import java.util.Scanner; 
public class BinarySearchTask3{     
public static void main(String[] args){          
Scanner sc=new Scanner(System.in);    
System.out.print("Enter the size:");
int n=sc.nextInt();
int[] A=new int[n];
System.out.print("Enter the elements:");     
for(int i=0;i<n;i++){
A[i] = sc.nextInt();
}
System.out.print("Enter the Target element:");   
int Target=sc.nextInt();  
int start=0;      
int end=A.length-1; 
boolean found = false;       
while(start<=end){               
int mid=(start+end)/2; 
if(A[mid]<Target){ 
start=mid+1; 
} else if(A[mid]>Target){ 
end=mid-1; 
} else{ 
System.out.println("Target found at the index:" +mid); 
found = true;
break;
}
}
if (!found) {
System.out.println("Target not found");
}
sc.close(); 
}
}