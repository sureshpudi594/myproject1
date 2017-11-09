 
  package JAVA;
//it is a process of wrapping  code and data members into a single unit is called encapsulation.
//it is also data hiding
//making fields in a class private and providing access public methods using getter and setter methods 
public class encapsulation {
	private int age=10;
	private String name;
	public int getage(){
		return age;
	}
	public String getname(){
		return name;
	}
	public void setage(int newage)
	{
		age=newage;
	}
	public void setname(String newname){
		name=newname;
	}

	public static void main(String[] args) {
		encapsulation obj=new encapsulation();
		obj.setname("selenium");
	System.out.println(obj.getname());
	
	System.out.println(obj.getage());

	}

}
