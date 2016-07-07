
public class PublicPrivateThis2 {
	private int hour;
	private int min;
	private int sec;
	public PublicPrivateThis2()
	{
		hour=0;
		min=0;
		sec=0;
	}
	public void setTime(int hour,int min,int sec)
	{
		this.hour=((hour >=0 && hour<24) ? hour : 0);
		this.min=((min >= 0 && min < 60) ? min : 0);
		this.sec=((sec >=0 && sec < 60 ) ? sec : 0);
	}
	public String toString()
	{
		return String.format("%02d:%02d:%02d %s", ((hour==0 || hour==12) ? 12 : hour%12),min,sec,((hour<12) ? "AM": "PM"));
	}

}
