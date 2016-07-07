
public class birthday {
	private int year;
	private int month;
	private int day;
	
	public birthday(int m, int d, int y){
		year=y;
		month=m;
		day=d;
	}
	public String toString()
	{
		return String.format("%02d:%02d:%04d",month,day,year);
	}

}
