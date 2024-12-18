package exception;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
           System.out.println(10/5);
           try {
        	   System.out.println(10/0);
           }catch(ArithmeticException e) {
        	   System.out.println("can't divdie by 0");
        	   
           }
           System.out.println(10/2);

	}

}
