package multithreading;
//1. creating user defined thread using thread class
class Programming{
	public void code() {
		System.out.println("code is simple");
	}
}
class JavaThread extends Thread{
	
	public void run() {
		//define thread job
		for(int i=1; i<=5; i++) {
			System.out.println("Java-" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
}
//2.Creating user defined thread using runnable interface

class PythonThread implements Runnable{
	
	public void run() {
		
		for(int i=1; i<=5;i++) {
			System.out.println("Python-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		JavaThread j = new JavaThread();
		j.start();//begin thread execution - the start is present in the thread class
		j.join(2000);
		//j.run(); new thread won't be started
		
		PythonThread p = new PythonThread();
		Thread t = new Thread(p);
		t.start();
		t.join();
		
		//main thread job 
		for(int i=1; i<=5;i++) {
			System.out.println("Main-" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("Python2-"+i);
		}
		

	}

}



