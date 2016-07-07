import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int ageNum=scan.nextInt();
		if(ageNum >=20 && ageNum <= 40)
			System.out.println("you are young");
		else if(ageNum<20 || ageNum>40)
			System.out.println("you aren't young");

	}

}
