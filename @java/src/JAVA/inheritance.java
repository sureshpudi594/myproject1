package JAVA;
//it is a process of inheriting the class members (variables and methods) from one class to another class is called inheritance
//a class where the class members are getting inherited is called super class/parent class
//A class to which the class members are getting inherited is called child class /subclass
//by using extends keyword we can get the class members from parent class
/*
 * **difference between inheritance and normal class methods
 * we can get the methods from another class by creating object to that class.but we can get only methods
 * in inheritance we can get both methods and variables(class members)from parent class
 */
public class inheritance {
	//declare static variables
	 static int a=2,b=3;
	//declare not static variables
	int c=4,d=5;
	//create static method with return value
	public static int add(){
		int result=a+b;
		return result;
	}
	//create static method with out return value
	public  static void multiply(){
		System.out.println(a*b);
	}
	//create non static method with return value
	public int add2(){
		int res=c+d;
		return res;
	}
	//create non static with out return value
	public void multiply2(){
		System.out.println(a*d);
	}

	public static void main(String[] args) {
		//access static class members using class  name
		int x=inheritance.add();
		System.out.println(x);
		System.out.println(inheritance.a);
		//access non static class members by using object
		inheritance obj=new inheritance();
		obj.add2();
		obj.multiply2();
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	

	}

}
