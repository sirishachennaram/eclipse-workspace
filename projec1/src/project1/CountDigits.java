package project1;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		int n;
		int count=0;
		System.out.println("enter a number:");
		Scanner r = new Scanner(System.in);
		 n= r.nextInt();
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("number of digits in a number is"+count);
		}
		
		

	}


