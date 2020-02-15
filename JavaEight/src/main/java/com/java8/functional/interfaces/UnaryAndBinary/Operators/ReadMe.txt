UnaryOperator : it is a child interface of Function interface 
                 if both input and outype are same then we can go for UnaryOperator for example 
                 
                 Function<Integer,Integer> fun= (a) ->  a+10;
                 
                 here we can see both input and output are of the same type if this was the case then we can move to 
                 Unary Operator. the only advantage for going this is we don't have to mention  two genric types
                 we can mention like in the below example 
                 
                 
                 
                 UnaryOperator<Integer> uOperator = a -> a+10;
                 
                 sysout(uOperator.apply(6))
                 
                 in the above example we mentioned only one genric parameter which indicates both input and output
                 types are same 
                 
                 
     Primitive version of UnaryOperator :
     -----------------------------------
                IntUnaryOperator;
                
                
                Interface IntUnaryOperator
                {
                public int applyAsInt();
                
                }
                
                this interface will never take genric arguments because it always take int input and give int output
                
                
                similarly we have LongUnaryOperator, DoubleUnaryOperator contains methods  as applyAsLong(),applyAsDouble()
                
                
                
 BinaryOperator : Bifunction we have like this 
                       
                       BiFunction(T t,U u,R t)->(a,b) -> return a+b;
                       
                       
                       if input's and ouptput are of same type then we can go for BinaryOperator like unaryOperator
                       
                       
                       public BinaryOperator<t> 
                       {
                       
                       public T apply(T t1,T t2 );
                       
                       }  
                      
                  example : BinaryOperator <String>  f =(s1,s2) -> s1= S1+S2;
                  
                  sysout(f.apply("hello","vasavi"))
                  
                  notice that we have mentioned only one genric argument instead of three in bifunction this is the only 
                  advantage
                  
      Prmitive version of BinaryOperator : 
      ----------------------------------
      
      
        interface  IntBinaryOperator
        {
        
        public int applyAsInt(int i1,int i2)
        }
        
        
        example :
                     IntBinaryOperator intOper= (i1,i2) -> i+i2
                     sysout(intOper.applyAsInt(10,11))
                     
             we need to go for primitve version because we can avoid auboxing and unboxing 
             
             
             similarly we have long and double binary operators. 
             LongBinaryOperator. contains applyAsLong() method
             DoubleBinaryOperator. contains applyAsDouble() method
                  
                  
                  
                  
                                                