package JAVA;

public class exceptionhandling {

	public static void main(String[] args) {
		//it is a mechanism which handle exceptions while execution of a program like arithmetic and null pinter exceptions
try
{
int a=5,b=0,c;
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
	System.out.println("divicible by c is"+e);
}


	}

}
