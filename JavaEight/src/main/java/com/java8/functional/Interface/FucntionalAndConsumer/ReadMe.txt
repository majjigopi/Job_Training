Fucntional Interface
----------------------
   Only difference between Predicate and Functional interfaceS is functional interface can return any type but predicate only return 
   boolean. 
   Fucntional interface conatains apply() method. below is the method signature
   
   T: is the input parameter of any type
   R: is the return type of any type
   Fucntion<T,R>{
    R apply(T); 
    }
   
   example :
               Fucntion<String,int> fun= str-> str.lenght();
               fun.apply("Aishwarya") // produces result as  length of string. i.e 9
               
               apply() is the functional interface
               
    Fucntion Chaining :
    -----------------
    	Function chaining is used to apply the result to another function. suppose we have two functions like this 
    	
    	Fucntion<String,String> f1=str->str.upperCase();
    	Function<String,String> f2=str->str.subString(0,9);
    	
    	now we can apply function chaining like this 
    	
    	f1.andThen(f2) ---------> first f is resolved then f2 is resolved i.e is String will be converted to upper case
    	                          and then first nine charecters will be selected this is called function chaining. andThen
    	                          is the default method in the Functional inreface
    	f1.compose(f2) ---------> Compose is also default method in the fucntional interface. it is similar to andThen method
    						      but here f2 is resolved first and then f1 is resolved i.e is first nine characters 
    						      will be selcected first and then they are converted to upper case                        
    
    
    refer to class ExampleFucntionalInterface for example
    
	Primitive version of Functional interface's
	-----------------------------------------
	Why we are using primitive versions of functional interfaces for clarity refer com.java8.functional.interface.predicate
	 IntFucntion :  Which takes int input and returns Integer(we have to mention return type where input type is predefined) output
	 	 
	 	  primitive interface name : IntFunction
	 	 
	 	 IntFunction<Integer>  func= x-> x*x ;//<integer> is the return type that we are mentioning 
		 func.apply(10);
		   
		   similarly we have DobleFucntion, LongFunction,
		 
		 In the above program we mentioned input and output is predefined. Now we have some primitive types for that has predefined 
		 output
		 
		primitive interface name : ToIntFunction
		 
		 ToIntFunction<String> f=s -> s.length();
		 sysout(f.applyAsInt("Durga"))
		  
		  similarly we have ToLongFunction, ToDoubleFunction
		 
		 ToIntFunction is functional interface which is a primitive version to Function interface it can take any input and gives 
		 only int return type because the return type of its abstract method applyAsInt is int type
		 
		 
     Lets's look at another type of  Primitive type for Functional interface
     -----------------------------------------------------------------------
     
     	IntToDouble : primitve interface name : IntToDoubleFunction 
     	------------ 		  
	    here we no need to mention both input type and return type 
	     
	      Example : IntToDoubleFucntion f=i->Math.sqrt(i);
	                 sysout(f.applyAsDouble(5))
	
	  similarly we have IntToLongFunction,
	                    LongTointFunction
	                    LongToDobleFunction,
	                    DoubleToLongFucntion 
	                    DobleToIntFunction
	                    ToIntBiFunction
	                    ToLongBiFunction
	                    ToDoubleFunction
	  
	 BiFunction : Which takes two inputs and return one output 
	 -----------                     
	                 public BiFunction<T,U,R>
	                 {
	                 
	                 public R apply(T t,U u);   //where two and t,u are inputs and R is the rerurn type 
	                 
	                 }
	                 
	                 
	                 
	                 Example :
	                   
	                   BiFunction<Integer,Integer,Float> bifun=(a,b)-> Math.sqrt(a+b+c);
	                   
	                     bifun.apply(30,22);
	               
	                 
	   
    
    Consumer Fucnctional Interface :
    -------------------------------
    	It contains method  accept() which takes any thing and performs operation on it but it does not return any thing
    	
    	Consumer<Collection> consuemer=coll->coll.add(1);
    	
   		Consumer Chaining :
   			Consumer chaining contains default method called andThen(Consumer<T>)
   			
   			If we have accept functions like this  
   			
   			Consumer<String> consume=str->str.length();
   			Consumer<String> consume1=str->str.charAt();
   			
   			we can have function chaining like this  
   				
   					consume.andThen(consume1).accept("hello brother"); 
   					
   					refer to example ConsumerFunctionChaining
   					
   					
   					
   	BiConsumer :
   	------------
   	            accepts two inputs and gives nothing 
   	            
   	            example:  BiConsumer<String,String> biConsumer = (s1,s2)-> sysout(s1+s2);
   	                      sysout("hello","Vasavi");
   	         				
   			
   			
    	
   
  