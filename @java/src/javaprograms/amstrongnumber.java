package javaprograms;

public class amstrongnumber {

	public static void main(String[] args) {
		int n=153;
		int rem;int temp=n;
		int sum=0;
		
		while(n>0){
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
			
		}
		
if(temp==sum){
	System.out.println("amstrong");
}else{
	System.out.println("not amstrong");
}
	}

}
