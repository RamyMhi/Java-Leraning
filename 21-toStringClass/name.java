
public class name {
	private String firstname;
	private String lastname;
	private birthday birth;
	
	public name(String s, String s1,birthday b)
	{
		firstname=s;
		lastname=s1;
		birth=b;
	}
	public String toString()
	{
		return String.format("your name is %s %s and your brthday %s ", firstname,lastname,birth);
		
	}

}
