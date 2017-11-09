package javaprograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		boolean isprime=true;
		System.out.println("enter number");	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0){
				isprime=false;
				break;
				
			}}
			if(isprime){
				System.out.println("prime");
			}else{
				System.out.println("not prime");
			}
		}

	}


