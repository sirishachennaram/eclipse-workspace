package multithreading;
class MulTable {
	public void printMulTable(int num) {
		for(int i=1; i<=10;i++) {
		//10*0=10
		System.out.println(num+"*"+i+"="+(num*i));
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

class KohliThread extends Thread{
	MulTable  t;
	
	public KohliThread(MulTable t) {
		this.t= t;
}
	@Override
	public void run() {
		t .printMulTable(9);
		
	}
}
class DhoniThread extends Thread{
	MulTable t;
	
	public DhoniThread (MulTable t) {
		this.t =t;
}
	@Override
	public void run() {
		t.printMulTable(10);
	}
}

public class SynchronizationDemo2 {
		public static void main(String[] args) {
			MulTable t= new MulTable();
			
			KohliThread t1= new KohliThread(t);
			DhoniThread t2 = new DhoniThread(t);
			
			t1.start();
			t2.start(); 
			
			
			
			
			
			
			
			
			
		}

}
	}
}



