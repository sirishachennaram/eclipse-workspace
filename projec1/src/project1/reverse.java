package project1;
//input number 456---->654
import java.util.Scanner;

public class reverse {
	public static void main (String[] args) {
		int n,r;
	
		System.out.println("enter any number:");
		Scanner ref= new Scanner(System.in);
		 n=ref.nextInt();
		while(n>0);
		{
			r =n%10;
			System.out.println(r);
			n=n/10;
		}
	}

	
}
