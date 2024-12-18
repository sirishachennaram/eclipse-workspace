package Interface;

public class FunctionalInterfacesDemo {
	public static void main(String[] args) {
		Printer p= new EpsondPrinter();
		p.printjob();
		p.scan();
		Printer.threeDPrint();
		
		
	}

}
