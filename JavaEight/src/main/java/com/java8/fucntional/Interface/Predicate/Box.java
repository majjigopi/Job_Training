package com.java8.fucntional.Interface.Predicate;

class Box{
protected Object obj;
 
public void setObj(Object object){
this.obj=object;}
 
public Object getObj(){
return obj;}


public static void main(String args[])
{ 
	int k=6;
	Box b=new Box();
	b.setObj(k);
	System.out.println(b.getObj());
}
}
