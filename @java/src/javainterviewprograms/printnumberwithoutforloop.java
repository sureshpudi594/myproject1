package javainterviewprograms;

public class printnumberwithoutforloop {

	public static void main(String[] args) {
		printnumbers(1);

	}
public static void printnumbers(int n){
	
	if(n<=10)
	{
		System.out.println(n);
		printnumbers(n+1);
	}
}
}
