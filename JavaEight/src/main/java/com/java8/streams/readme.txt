STREAMS
-----------------------------------------------
  Streams are used to do operation's on objects of collection 

Streams are one of the major functionality in java. Object of the stream can be obtained by using existing collection
 object. stream method is added in the collection interface so if we use like this
 
  List<Employee> l=new ArrayList<employee>();
   Stream s= l.Stream();
   
   We can also create stream from list of objects.
   
   Stream s= Stream.of(obj1,obj2,obj3,obj4,obj5,obj6);
   
   
   Operation of stream on collection objects :
   -----------------------------------------
   	 
   	 Filter  operation  : filter(Predicate)  this function takes predicate implimentation
   	 Map     operation  : map(Function)      this function takes Function implimentation
   	 ForEac  Consumer   : forEach(Consumer)  this function takes consumer implimentation 