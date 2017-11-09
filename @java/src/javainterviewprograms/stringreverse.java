package javainterviewprograms;

public class stringreverse {


	 public static void main(String args[]){
		    String []str = "He is the one".split(" ");
		    String rev="";
		        for(int i = str.length-1; i>= 0 ;i--){
		            rev = rev+str[i]+" ";
		        }
		        System.out.println(rev);
		    }
}

