package javaprograms;

import java.util.Arrays;

public class duplicatevalues {

	public static void main(String[] args) {
		int []a={0,0,1,2,2,5,5,8,6,6};
		Arrays.sort(a);
		for(int i=1;i<a.length;i++){
			if(a[i-1]==a[i]){
				System.out.println(a[i]);
			}
		}

	}

}
