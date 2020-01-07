package com.java8.lamdas;

public  class LamdaExamples {
	
	public static  void main(String args[]) {
		
		
	Runnable run1=new Runnable() {

		@Override					
		public void run() {
			System.out.println("Running Imperative program with out lamda run1");
			}
			
		};
		
	new Thread(run1).start();
	
	//way to define anonamus functional interface
	Runnable run2=()->{System.out.println("Running Imperative program with out lamda run2");};
	
	new Thread(run2).start();
	
	new Thread(()-> {System.out.println("Running Imperative program with out lamda run3");}).start();
	
	}
		
		
	
		
	
	
	
	
	

}
