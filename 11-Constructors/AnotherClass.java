
public class AnotherClass {
	private String yourName;
	private int yourAge;
	public AnotherClass(String name,int age)
	{
		yourName=name;
		yourAge=age;
		
	}
	public String getName()
	{
		return yourName;
	}
	public int getAge()
	{
		return yourAge;
	}
	public void msg()
	{
		System.out.println("your name is :"+getName());
		System.out.println("your Age is :"+getAge());
	}
	

}
