package com.java8.lamdas;


/*this  class defines anonamus interface named Interf the pupose is to show how this keywork behaves with 
 *  lamda expression in the thirteenth line method2 show us how this keyword works this.x prints the value of 
 *  x as 1 where as x with out "this" keyword prints value 0 on the console 
 *  this keyword inside lamda expression refers to outer class current object 
 *  see AnonamousInnerClass for more clarity on the differnce between implimentation of inner classes using
 *  lamda and old methods fo implimentation   */



public class InnerClassLamda {
	
	int x=1;
	public void method2()
	{
		int y=10;
		Interf i=()->{
			int x=0;
			
			System.out.println(this.x);
			System.out.println("y");
			this.x=111;//it is fine 
			//y=66; // once we used local variable y(local method level variable) inside lamda expression then the value will be freezed i.e it will become final and cannot be changed
		
		//the local variable which is "y" using inside lamda expression  makes the variable as final but x=1(class variable)
		//which is class level variable accessed inside lamda expression will not be final. the value of y cannot be 
		//changed inside or oustside lamda expression but where as valut of x=1(class level variable) can be changed i.e is the above rule applicable for only local variables
		};
		i.m1();
	}
	
	public static void main(String args[])
	{
		new InnerClassLamda().method2();
	}

}
//if Interf interface has more than  has more than one method in it then we cannot use lamda expression  
//from lamda expression we can acsess variables inside the method and outer class variables