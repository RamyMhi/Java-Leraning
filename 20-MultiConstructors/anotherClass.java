
public class anotherClass {
	private int var1;
	private int var2;
	private int var3;
	private int var4;
	
	public anotherClass()
	{
		//this(0,0,0,0);
		var1=0;
		var2=0;
		var3=0;
		var4=0;
	}
	public anotherClass(int a)
	{
		var1=a;
		var2=0;
		var3=0;
		var4=0;
	}
	public anotherClass(int a, int b)
	{
		var1=a;
		var2=b;
		var3=0;
		var4=0;
	}
	public anotherClass(int a, int b,int c)
	{
		var1=a;
		var2=b;
		var3=c;
		var4=0;
	}
	public anotherClass(int a, int b, int c, int d)
	{
		var1=a;
		var2=b;
		var3=c;
		var4=d;
	}
	public int get1()
	{
		return var1;
	}
	public int get2()
	{
		return var2;
	}
	public int get3()
	{
		return var3;
	}
	public int get4()
	{
		return var4;
	}
	
}
