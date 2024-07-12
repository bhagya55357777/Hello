package multithreading;
class eclipse extends Thread{
public 	void run() {
	//2for(int i=0;i<5;i++)
		//1System.out.println("eclipse run method");3 is id 4 name
		//System.out.println("eclipse ID:"+Thread.currentThread().getId());
		//System.out.println("eclipse priority:"+Thread.currentThread().getPriority());9 
	
	System.out.println(Thread.currentThread().getPriority());
		System.out.println("eclipse Name:"+Thread.currentThread().getName());
		
	
	}
}
class powerpointppt extends Thread{
	public void run() {
		//5for(int i=0;i<5;i++)//can change output order mixed o/p is observed
		//5System.out.println("ppt run method");
			//6System.out.println("ppt ID:"+Thread.currentThread().getId());
		
		//7System.out.println("ppt priority:"+Thread.currentThread().getPriority());
		System.out.println("ppt Name:"+Thread.currentThread().getName());
		
		
	}
}
public class main {
	public static void main(String[]args) {
		eclipse e=new eclipse();//prioty start wid 1  cant exceed 10 and cant be ecided by the user 
		e.start();
		//8e.setPriority(4);
		//10e.setPriority(Thread.MAX_PRIORITY);11
		//12e.setPriority(Thread.MIN_PRIORITY);13
		e.setPriority(Thread.NORM_PRIORITY);
		powerpointppt p=new powerpointppt();
		p.start();
		p.setPriority(8);
		System.out.println("main Thread Name:" +Thread.currentThread().getName());
	}

}
