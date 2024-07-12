package multithreading;
class chrome implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("chrome run method");
		try {
			Thread.sleep(1000);//thread is inbuilt so it shd be called by method name and in ms its used to make some system software start slowly
		
		}
		catch(InterruptedException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	
}
}
}
class notes implements Runnable{
	public void run() {
		System.out.println("notes run method");
	}
}
public class myclass {
	public static void main(String[]args) {
		chrome c=new chrome();
		Thread obj=new Thread(c);
				obj.start();
	}

}

