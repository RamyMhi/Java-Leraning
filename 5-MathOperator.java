import java.util.Scanner;
public class MathOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum=scan.nextInt();
		System.out.println("Enter Second number");
		int secondNum=scan.nextInt();
		
		int result=firstNum+secondNum;
		System.out.println("first + second: "+result);
		
		result=firstNum-secondNum;
		System.out.println("first - second: "+result);
		result=firstNum/secondNum;
		System.out.println("first / second: "+result);
		result=firstNum%secondNum;
		System.out.println("first % second: "+result);
		result=firstNum*secondNum;
		System.out.println("first * second: "+result);
		firstNum++;
		System.out.println("first ++ : "+firstNum);
		firstNum--;
		System.out.println("first -- : "+firstNum);
		result+=5;
		System.out.println("result +=5 ( result=result+5): "+result);
		result-=5;
		System.out.println("result -=5: "+result);
		result*=5;
		System.out.println("result *=5: "+result);
		result/=5;
		System.out.println("result /=5: "+result);
		result%=6;
		System.out.println("result %=6: "+result);
		
		
		
		

	}

}
