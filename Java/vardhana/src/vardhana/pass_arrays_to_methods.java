package vardhana;

public class pass_arrays_to_methods {

	public static void main(String[] args) {
		int a[]={3,4,5,6,7};
		change(a);
		for(int y:a)
			System.out.println(y);
		
	}
	
	public static void change(int x[]){
		for(int i=0;i<x.length;i++)
			x[i]+=5;
	}

}
