package exception;
import java.util.Scanner;
public class MyAtmApp {
	static double balance = 5000.0;
	static int originalPin = 1234;
	//static int originalupipin = 0407;
	public static boolean authenticant(int pin) {
		if(pin == originalPin) {
			return true;
		}
		return false;
	}
	/*public static boolean authenticant1(int upipin) {
		if(upipin == originalupipin) {
			return true;
		}
		return false;
	}*/

	public static void main(String[] args) {
		int pin = 0;
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("ATM APPLICATION");
			System.out.println("---------------");
			System.out.println("1.Balance Check");
			System.out.println("2. Deposit Amount");
			System.out.println("3. WIthdraw Amount");
			System.out.println("0. Exit");
			System.out.println("Please select option");
			option = in.nextInt();
			switch (option)
			{
			
			case 1: 
				System.out.println("Please enter pin");
				pin = in.nextInt();
					if(authenticant(pin)) {
				System.out.println("Balance:"+ balance);
					}else {
						System.out.println("Invalid Pin");
					}
				break;
			
			
			case 2:
				System.out.println("Please enter pin");
				pin = in.nextInt();
					if(authenticant(pin)) {
						System.out.println("Deposit");
						double depositAmount = in.nextDouble();
						balance = balance + depositAmount;
						System.out.println("Deposit is Succesful!");
					}else {
						System.out.println("Invalid Pin");
					}
					break;
				/*System.out.println("Deposit");
				double depositAmount = in.nextDouble();
				balance = balance + depositAmount;
				System.out.println("Deposit is Succesful!");
				break;*/
			
			
			case 3:
				System.out.println("Please enter pin");
				pin = in.nextInt();
					if(authenticant(pin)) {
						System.out.println("Withdraw");
						double withdrawAmount = in.nextDouble();
						balance = balance-withdrawAmount;
						System.out.println("withdraw is done Succesfully!");
					}else {
						System.out.println("Invalid Pin");
					}
					break;
			case 0:
				System.out.println("Thank You for using ATM");
				System.out.println("Have a Nice Day");
				System.out.println("Exit");
				System.exit(0);//Terminate JVM
				break;
			
			default:
				System.out.println("Invalid Option!");
				break;
			}
		}while(option !=0);

	}

}