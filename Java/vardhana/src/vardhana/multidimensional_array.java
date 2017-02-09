package vardhana;

public class multidimensional_array {

	public static void main(String[] args) {
		int a[][]={{8,9,10,11},{12,13,14,15}};
		int b[][]={{30,31,32,33},{43},{4,5,6}};

		System.out.println("This is the first array\n");
		display(a);
		
		System.out.println("This is the second array\n");
		display(b);
		
	}
	public static void display(int x[][]){
		
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
	}
	}

}
