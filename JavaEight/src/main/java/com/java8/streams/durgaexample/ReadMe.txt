Streams :Stream is an interface present in java.util.stream package and stream() is a method present as default method in 
         java.util package 
         
         
         Stream s= collectionObject.stream()
         
        after getting stream object we have procesess the stream . processing consists of two stages
        
        	1. configuration
        	2. processing
        
        again configuration can be done with two methods map and filter 
        
       Filtering Mechanism :
          bases on some boolean  value if we want to filter some collection object  we can use fil
          tering mechanism 
          
          we can configure filter by filter method in stream interface
          
          Stream filter(predicate t)
          
        Mapping mechanism : based on every object in the collection . if we want to create a separate new object with 
                            condition that number object should be same then we can go for map.
                            
                            mapping mechanism can be implimented by using map method. map method is present in stream
                            interface 
                            
                            public stream map(Fucntion<t,r> f) 
                            
        various methods of stream :
        --------------------------
         collect method : is used to collect elements from the stream and adding to the specified 
         collection 
         
         look for collect class in this package  
         
         count method : 
             if we want to count number of  element present in the stream the we can go 
              for count method   
              
         Sorted Methods : we can use sorted method to sort elements in a stream. there are two sorted 
                          methods 
                          
                          Sorted();
                          Sorted(Comperator c)
         Min and Max methods : These are used to find minimum and maximum val in a stream . values should be sorted in
         order to find min and max values in stream or we have to pass comperator object to overloaded min and max
         mentods 
         
         min(Comperator c) //returns manimum value accroding to the specified comperataor
         max(comperator c) //returns maximum value accroding to the specified comperator
         
         
         ForEach Mehtod : takes lamda expression and applies for each element in the stream 
         
         toArray method : to copy elements present in the stream to array
         
         
         Streams can be applicable to any group of values or arraly not only to streams 
         
         stream  method :   of(array[]) takes array input or group of values like Stream.of(9,9999,99,999)              
                       
                            
                                                 
                            
                            
                            
          
          
           
       	