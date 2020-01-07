Fucntional Interface
----------------------
   Only difference between Predicate and Functional interface is functional interface can return any type but predicate only return 
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
    
    
    refer to class ExampleFucntionalInterface for exam
    
    Consumer Fucnctional Interface :
    -------------------------------
    	It contains method  accept() which takes any thing and performs operation on it but it does not return any thing
    	
    	Consumer<Collection> consuemer=coll->coll.add(1);
    	
   		Consumer Chaining :
   			Consumer chaining contains default method called andThen(Consumer<T>)
   			
   			If we have accept function like this  
   			
   			Consumer<String> consume=str->str.length();
   			Consumer<String> consume1=str->str.charAt();
   			
   			we can have function chaining like this  
   				
   					consume.andThen(consume1).accept("hello brother"); 
   					
   					refer to example ConsumerFunctionChaining
   			
   			
    	
   
  