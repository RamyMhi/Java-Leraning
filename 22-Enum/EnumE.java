
public enum EnumE {
	ramin ("chocolate","2"),
	pourya ("lavashak ","7"),
	pouya ("pastel" , "10"),
	shahab ("icecream","15"),
	ali ("all" , "5");
	
	private String desc;
	private String num;
	
	EnumE(String description, String number)
	{
		desc=description;
		num=number;
	}
	public String getDesc()
	{
		return desc;
	}
	public String getNum()
	{
		return num;
	}
	

}
