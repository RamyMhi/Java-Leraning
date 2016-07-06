import java.util.Scanner;
public class IfState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num>0)
			System.out.println("is posetive");
		else if(num<0)
			System.out.println("is negetive");
		else
			System.out.println("is 0");

	}

}
