package Interface;
public interface InterfaceDemo1 {

	public static void main(String[] args) {
		//instantiation is not possible for interface
		
		
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.sum(10 ,5));
		System.out.println(myCalc.sub(10 ,5));
		System.out.println(myCalc.mul(10 ,5));
		System.out.println(myCalc.div(10 ,5));
		System.out.println(myCalc.findSquare(10));
		System.out.println(myCalc.findCube(10));
		
		
		System.out.println("--------------------");
		
		Calc c = new MyCalc();
		System.out.println(c.sum(4 ,7));
		System.out.println(c.sub(4 ,7));
		System.out.println(c.mul(4 ,7));
		System.out.println(c.div(4 ,7));
		System.out.println(c.findSquare(10));
		System.out.println(c.findCube(10));

	}
 

}
