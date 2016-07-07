import java.util.Scanner;
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fArray[][]={{0,1,2,3,4},{1,2,3,4}};
		for(int i=0;i<fArray.length;i++)
		{
			for(int j=0;j<fArray[i].length;j++)
				System.out.print(fArray[i][j]+"\t");
			System.out.println();
		}
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int sArray[][]=new int[x][y];
		// i<x or i<sArray.length
		for(int i=0;i<x;i++)
			//j<y or j<sArray[i].length
			for(int j=0;j<y;j++)
				sArray[i][j]=scan.nextInt();
		
	}

}
