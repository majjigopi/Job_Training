There are already some predefined fucntional interface that are defined by java people they 
	Predicate
	Fucntion
	consumer
	supplier
an interface which contains single abstract method is called functional interfaces. a functional interface can contain any number of default and static methods 
but can contain only one abstract method to call it as functional interface

Predefined funtional interface present in java.util.fucntion. it contains test method which takes one  argument and returns boolean value. refer the class PredicateFunctionalInterfce
	
PREDICATE jOINING
-----------------
     we can join two predicate function to do AND,OR,NEGATE operations. Since test function in predicate interface returns boolean value. we can combine 
	 two predicate function like shown below
	 
	  	Predicate<Integer> p1= I -> I>10; ------ case_1
	  
	  Above lamda expression returns weather a number greater than 10 or not. If we use it like p1.negate(). negate() is default method in predicate interface).
	  negate gives opposite result. in case_1 if I is  less than 10 it reruns true
	  
	  Predicate p2=p1.negate();  
	  
	  boolean b=p2.test(7); //returns true
	  
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
            it contains default method And,Negate and Or methods
            
            
AutoBoxing : Take 
              Integer i=10;----->(1)
               
              before 1.4 version it is this statement gives error. But after 1.4 it does'nt because of autoboxing. the
              procesess of auto converting primitive type to object type is called autoboxing
              
              Integer i=10; befor 1.4 version we have to write like this Integer i=Integer.valueOf(10);
               
AutoUnboxing :   From referece to the above statement 

                    int x =i; //from statement (1) 
                    
                    the above statement is called auto unboxing. beacause it is converting object type to primitive type
                             
GenricTypeParameters : ArrayList<Integer> al=new ArrayList<Integer>(); --->valid
                       ArrayList<int> al=new ArrayList<int>();---> Not valid because of primitive types are not valid
                                                                   for genrics

                                                                   
Primitive functional interface : The reason we need to go for this is Genrics would not allow primitive types as genric
                                 arguments 
                                  
            for example lets take predicate functional Interface 
            
               Predicate<Integer> p = i->i*10 //pass 10 will return 100
                                                                                      
               p.test(10); //here we are sending primitive type as arguments to the test() method. since we are sending
                             primitive types it has to convert to Integer type then for multiplication it has to again
                             convert to primitive type. so this type of auto boxing and unboxing makes perfromace slow
                             to avoid this we should go for primitive  fucntional interfaces.
              if our input and output are primitive types then it is better to go with primitive functional interface
      
      
Primitive Predicate : IntPredicate(takes only int as input),DoublePredicate(takes only double as input),FloatPredicate(takes only float as input),LongPredicate      
      
      
      
15 types of primitive functional interfaces : refer to documentation of primitve function interfaces on internet
----------------------------------
                      Simlary refer consumer and supplier version of primitive version 
                      unary operator and binary operator and its primitive version
                      
                      
BiPredicate : BiPredicate is an interface in which we can give two input's and returns boolean. but the basic version takes only one input 

              example : BiPrediate<Integer, Integer> biPredicate= (a,b) -> a+b < 50;   
                         sysout(biPredicate.test(30.15));                     

                                     
               
                                                                                      