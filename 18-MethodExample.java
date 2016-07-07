
public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(5);
		int a1=ave1(5,20);
		int arr[]={2,3,4,5,6,7,8};
		int a2=ave2(arr);
		int a3=ave3(1,2,3,4,5,6,7,8,98,7,5,3,1234);
		System.out.println("ave1 output="+a1);
		System.out.println("ave2 output="+a2);
		System.out.println("ave3 output="+a3);

	}
	public static void m1(int x)
	{
		System.out.println(x);
	}
	public static int ave1(int x,int y)
	{
		return (x+y)/2;
	}
	public static int ave2(int[] x)
	{
		int result=0;
		for(int i=0;i<x.length;i++)
			result+=x[i];
		return result/x.length;
	}
	public static int ave3(int...numbers)
	{
		int result=0;
		for(int i:numbers)
			result+=i;
		return result/numbers.length;
	}

}
