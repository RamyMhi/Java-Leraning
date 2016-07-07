
public class MultiConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anotherClass obj1=new anotherClass();
		anotherClass obj2=new anotherClass(1);
		anotherClass obj3=new anotherClass(1,2);
		anotherClass obj4=new anotherClass(1,2,3);
		anotherClass obj5=new anotherClass(1,2,3,4);
		System.out.println("obj1="+obj1.get1()+" "+obj1.get2()+" "+obj1.get3()+" "+obj1.get4()+" ");
		System.out.println("obj2="+obj2.get1()+" "+obj2.get2()+" "+obj2.get3()+" "+obj2.get4()+" ");
		System.out.println("obj3="+obj3.get1()+" "+obj3.get2()+" "+obj3.get3()+" "+obj3.get4()+" ");
		System.out.println("obj4="+obj4.get1()+" "+obj4.get2()+" "+obj4.get3()+" "+obj4.get4()+" ");
		System.out.println("obj5="+obj5.get1()+" "+obj5.get2()+" "+obj5.get3()+" "+obj5.get4()+" ");

	}

}
