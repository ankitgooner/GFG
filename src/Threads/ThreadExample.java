package Threads;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class ThreadExample  {
	
 public static void main(String a[]){
	 
	Thread mt1=new Thread(new MyThread());
	Thread mt2=new Thread(new MyThread());
	Thread mt3=new Thread(new MyThread());
	Thread mt4=new Thread(new MyThread());
	Thread mt5=new Thread(new MyThread());
	Thread mt6=new Thread(new MyThread());
	Thread mt7=new Thread(new MyThread());
	Thread mt8=new Thread(new MyThread());
mt1.start();
mt2.start();
mt3.start();
mt4.start();

mt5.start();
mt6.start();

mt7.start();
mt8.start();


 }
}
class MyThread implements Runnable{
	int k=10;
	
	public void run(){
		doit();
		
	}
	synchronized void doit(){
		
		Tester local1=Tester.sharedInstance;
		local1.i+=10;
		local1.j+=10;
		k+=10;
		System.out.println(local1.i+" "+local1.j+" "+k);
		System.out.println("thread name"+Thread.currentThread().getName());
	}
}

class Tester{
	
	public static final Tester sharedInstance =
	        new Tester();
	
	int i=10;
	Integer j=new Integer(10);
			
	
	
}