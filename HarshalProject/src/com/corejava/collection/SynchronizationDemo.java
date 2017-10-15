package com.corejava.collection;

public class SynchronizationDemo {

	public static void main(String[] args) {

		Reservation reservation = new Reservation();

		ReservationThread vimal = new ReservationThread(reservation, 1);
		ReservationThread harshal = new ReservationThread(reservation, 1);

		vimal.setName("Vimal");
		harshal.setName("Harshal");

		vimal.start();
		harshal.start();




	}
}

/**
 * Thread class
 * @author Vimal
 *
 */
class ReservationThread extends Thread {
	private Reservation reservation;
	private int required;

	ReservationThread(Reservation reservation, int required) {
		this.reservation = reservation;
		this.required = required;
	}

	public void run(){
		reservation.reserve(required);			
	}
}

/**
 * resource class
 * @author Vimal
 *
 */
class Reservation {
	int totalSeat = 1;
	public  void reserve(int required){

		synchronized (this) {
			if(required <= totalSeat) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				totalSeat = totalSeat - required;
				System.out.println(Thread.currentThread().getName()+ ": SUCCESS");
			} else {
				System.out.println(Thread.currentThread().getName()+ ": FAIL");
			}
		}
	}

}
