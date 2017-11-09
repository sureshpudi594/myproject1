package JAVA;
// existence of object behavior in many forms
public class methodoverloading {
//if two or more  methods having same method name in the same class but different signatures
	void m1(){
		System.out.println("qa");
	}
	void m2(int a){
		System.out.println(a);
	}
	void m3(String name){
		System.out.println(name);
	}
	public static void main(String[] args) {
		methodoverloading obj=new methodoverloading();
				obj.m1();
		obj.m2(12);
		obj.m3("suresh");
		

	}

}
