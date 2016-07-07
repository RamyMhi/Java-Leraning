import java.util.*;
public class ArrayDef {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		//0-9
		int intArray[]=new int[10];
		for(int i=0;i<10;i++)
			intArray[i]=scan.nextInt();
		System.out.println("intArray[0]="+intArray[0]);
		//0-4
		int nextArray[]={5,2,6,10,42};
		for(int i=0;i<nextArray.length;i++)
			System.out.println(i+"\t"+nextArray[i]);
		
		
		

	}

}
