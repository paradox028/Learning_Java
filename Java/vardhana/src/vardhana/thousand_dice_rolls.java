package vardhana;
import java.util.Random;

public class thousand_dice_rolls {

	public static void main(String[] args) {
	Random n= new Random();
	int freq[]=new int[7];
	
	for(int roll=1;roll<1000;roll++){
		++freq[1+n.nextInt(6)];
	}
	
	System.out.println("Face \t frequency ");
	 for(int face=1;face<freq.length;face++)
		 System.out.println(face+"  \t  "+freq[face]);
	
	}

}
