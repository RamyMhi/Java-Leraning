import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		// 5 random numbers between 1-10
		for(int i=0;i<5;i++)
			System.out.println(rnd.nextInt(10)+1);
		

	}

}
