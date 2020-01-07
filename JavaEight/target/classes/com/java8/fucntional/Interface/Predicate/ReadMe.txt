There are already some predefined fucntional interface that are defined by java people they 
	Predicate
	fucntion
	consumer
	supplier
an interface which contains single abstract method is called functional interfaces. a functional interface can contain any number of default and static methods 
but can contain only one abstract method to call it as functional interface

Predefined funtional interface present in java.util.fucntion. it contains test method which takes one  argument and returns boolean value. refer the class PredicateFunctionalInterf
	
PREDICATE jOINING
-----------------
     we can join two predicate function to do AND,OR,NEGATE operations. Since test function in predicate interface returns boolean value. we can combine 
	 two predicate function like shown below
	 
	  	Predicate<Integer> p1= I -> I>10; ------ case_1
	  
	  Above lamda expression returns weather a number greater than 10 or not. If we use it like p1.negate()( negate() is default method in predicate interface).
	  negate gives opposite result. in case_1 if I is  less than 10 it reruns true
	  
	  Predicate p2=p1.negate();  
	  
	  boolean b=p2.test(7); //returns false
	  
	  We have AND and OR methods similar in predicate interface to do AND and OR operations  
	  
	  predicate p3=I -> I/2==0; ------ case_2 //checks prime number
	  
	  predicate p4=p1.and(p2)
	  
	  p4.test(6); //it returns AND operation for the number 6 in which it will check it is both prime number and it is greater than 10 or not  
	  
	  predicate p5=p1.or(p3);
	  
	  p5.test(8); //it returns or operation between weather the nuber is either greater than 10 or prime number
	  
	  
	  see the example PrdicateJoining
	                  ---------------
 Predicate isEqual() method 
 ---------------------------
         check weather two objects or basic data types are equal or not 
         
         example 
                Predicative<String> p=Predicative.equals("Hello");
                p.test("Hello"); //returns false	                  
	                 
Summary
-------
            Predicate is a functional interface contains test method which checks weather a condition is satisfied or not
            it contains default method AND and OR methods
            
            
