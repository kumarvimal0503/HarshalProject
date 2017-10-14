package com.corejava.basic;

import java.io.IOException;

public class MethodOverrideDemo {
	
	public static void main(String[]args){
		
		A1 a = null;
		
		try {
			a.display();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}


class A1 {
	public void display() throws IOException{
		System.out.println("N parent");
	}
}


class B extends A1 {
	
	@Override
	public void display() throws NullPointerException {
		System.out.println("N child");
	}
}