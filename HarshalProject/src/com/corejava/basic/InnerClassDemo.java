package com.corejava.basic;

public class InnerClassDemo {
	
	public static void main(String[]args){
		
		OuterClass outerClass = new OuterClass();
				
		OuterClass.InnerClass inner =  outerClass.new InnerClass();
		inner.doSomething();
	}
	
	public void doSomething(){
		
	}
	
	
	

}


class OuterClass {
	int a = 20;
	
	class InnerClass {
		int b = 100;
		int a = 10;
		
		public void doSomething(){
			System.out.println("B= "+b);
			System.out.println("A= "+OuterClass.this.a);
		}
		
	}
	
	
}
