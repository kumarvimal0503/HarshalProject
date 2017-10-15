package com.corejava.collection;

public class ThreadDemoMain {

	public static void main(String[] args) throws InterruptedException {
		
		Job j1 = new Job();
		Job j2 = new Job();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		
		t1.start();
		t2.start();
		
		

	}

}


class Job implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(Thread.currentThread().getName()+": Prints: "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
