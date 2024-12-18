package Interface;
/*Functional Interface = only 1 abstract method +(default & static methods)
 * Introduced in java8
 */
 
@FunctionalInterface
public interface Printer {
	//only one abstract method is allowed
	void printjob();//implicitly public abstract
	
	//Any no.of default and static methods are allowed.
	
	default  void scan() {
		System.out.println("scan...");
	}
		
		static void threeDPrint() {

			System.out.println("3D print...");
			
		}
		
}
		

		
	


