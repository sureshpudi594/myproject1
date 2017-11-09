package javaprograms;

import java.util.Scanner;

public class febnocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of series");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
					
		}
		

	}
	

}
