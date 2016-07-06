import java.util.Scanner;
public class MultiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		AnotherClass AC=new AnotherClass();
		AC.msg();
		AC.pName(name);
		AC.pAge(age);

	}

}
