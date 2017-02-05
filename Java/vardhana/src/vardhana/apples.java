package vardhana;
import java.util.Random;
import java.util.Scanner;

public class apples {
	public static void main(String args[]){
		Random x =new Random();
		Scanner n=new Scanner(System.in);
		int y,guess,count=1;
		y=1+x.nextInt(100);
		System.out.println("\nWelcome to the Random number game!\n");
		System.out.println("\nEnter a number between 1 to 100: ");
		do
		{
		 
		 System.out.println("\nTry "+count+ ":" );
		 guess=n.nextInt();
		 if(guess==y)
			System.out.println("\nGuessed it right!\n");
		 else if(guess>y)
			 System.out.println("\nGo lower.\n");
		 else
			 System.out.println("\nGo higher.\n");
		 count++;
		}while(count!=21&&guess!=y);
	}

}
