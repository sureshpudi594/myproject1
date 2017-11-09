
package JAVA;
//if two methods have same name same signatures but two from different classes then it is called method overriding
public class methodoverriding extends methodoverloading {
	void m1(){
		System.out.println("selemium");
	}

	public static void main(String[] args) {
				methodoverloading obj1=new methodoverriding();
		obj1.m1();
		
}}
/**
 * class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}
 */

