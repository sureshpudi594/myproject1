package javaprograms;

public class palindrome {

	public static void main(String[] args) {
	
String original="madam";
String reverse="";
for(int i=original.length()-1;i>=0;i--){
	reverse=reverse+original.charAt(i);
	
}
if(original.equals(reverse)){
	System.out.println("palindrome");
}else{
	System.out.println("not palindrome");
}
	}

}
