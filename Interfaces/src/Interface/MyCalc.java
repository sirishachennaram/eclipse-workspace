package Interface;
public class MyCalc implements Calc{
	public int sum(int x, int y) {
		return x+y;
	}
	public int sub (int x , int y) {
		return x-y;
	}
	public int mul(int x, int y ) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	}
	public int findSquare(int x) {
		return x*x;
	}
	
	public int findCube(int x) {
		return x*x*x;
	}

}


