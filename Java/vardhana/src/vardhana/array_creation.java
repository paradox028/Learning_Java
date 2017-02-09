package vardhana;
import java.util.Scanner;

public class array_creation {
	public static void main(String args[]){
	int a[]= new int[15];
	int i,n;
	Scanner x = new Scanner(System.in);
	System.out.println("\nEnter no. of elements>\n ");
	n=x.nextInt();
	for(i=0;i<n;i++){
		System.out.printf("\nEnter element %d ",i+1);
		a[i]=x.nextInt();
	}
	System.out.println("\nEntered elements are :\n");
	for(i=0;i<n;i++){
		System.out.printf("\t %d",a[i]);
	}
  }
}
