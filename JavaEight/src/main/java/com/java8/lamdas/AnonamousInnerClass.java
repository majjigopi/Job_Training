package com.java8.lamdas;


/*This is an example show how to access outer class x variable in the inner class  
 * this keyword in anonamus inner class refers to inner class refernce object but */
public class AnonamousInnerClass {
	int x=1;
	public void m2()
	{
		
		//start of anonomous inner class
		
		Interf i=new Interf(){
			int x=0;
			@Override
			public void m1() {
				
				
			System.out.println(this.x);	//way to accsess outer class x variable if we want to acsess only inner class x variable the 
			//we can write like system.out.print(x)
			}
			
		};
		i.m1();
	}
	
	public static void main(String args[])
	{
		
		new AnonamousInnerClass().m2();
	}

}
