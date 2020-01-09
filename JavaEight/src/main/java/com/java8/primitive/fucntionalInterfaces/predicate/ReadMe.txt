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
                      unary operator and binary operator and its prim

                                     
               
                                                                                      