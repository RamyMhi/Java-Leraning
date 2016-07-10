import java.util.EnumSet;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(EnumE people:EnumE.values())
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getNum());
		
		System.out.println("\n\nEnumSet range example:\n\n");
		
		for(EnumE people:EnumSet.range(EnumE.pourya, EnumE.shahab))
			System.out.printf("%s\t%s\t\t%s\n", people,people.getDesc(),people.getNum());
			
	}

}
