
package javainterviewprograms;

public class charactercount {

	public static void main(String[] args) {
		String str="suresh suresh";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='s'){
				count++;
			}
		}
System.out.println(count);
	}

}
