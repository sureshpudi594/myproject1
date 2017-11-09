package JAVA;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int fact=1;
		Scanner s=new Scanner(System.in);
int num =s.nextInt();
System.out.println("enter number");
for(int i=1;i<=num;i++){
	fact=fact*i;
	System.out.println(fact);
}
	}
	

}
