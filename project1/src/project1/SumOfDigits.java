package project1;
import java.util.Scanner;

public class SumOfDigits {
	

	public static void main(String[] args) {
		
		int num=123;
		int rem=0;
		int sum=0;
		System.out.println("Enter any Number");
		Scanner ref=new Scanner(System.in);
		num=ref.nextInt();
		while(num>0) {
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		System.out.println("SumOfDigits:"+sum);
		}
	}

	

