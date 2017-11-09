package JAVA;

public class encaps2 extends encapsulation {

	public static void main(String[] args) {
		encaps2 obj=new encaps2();
		obj.setname("pandu");
		obj.setage(15);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
	

	}

}
/*
 * Actually we can not re use private fields in other classes,but in encapsulation we can use by using getter and setter methods
 */
