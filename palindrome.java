package programming;

import java.util.Scanner;

public class palindrome {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int temp;
	    int r,sum =0;
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		temp=n;
		while(n!=0 || n<0 ) {
			r=n%10;
            sum=(sum*10)+r;
            n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("Not palindrome");
		}
		
		
		
		
	}

}
