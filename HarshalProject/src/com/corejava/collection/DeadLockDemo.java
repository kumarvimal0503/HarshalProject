package com.corejava.collection;

public class DeadLockDemo {

	public static void main(String[] args) {
		Object r1 = new Object();
		Object r2 = new Object();
		
		MyThread t1 = new MyThread(r1, r2);
		MyThread t2 = new MyThread(r2, r1);
		
		t1.start();
		t2.start();
	}

}

class MyThread extends Thread {
	Object r1;
	Object r2;
	public MyThread(Object r1, Object r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run(){
		synchronized(r1){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (r2) {
				
			}
		}
	}
	
	
}
