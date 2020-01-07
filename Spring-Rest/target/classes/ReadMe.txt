Rest is light weight application protocol which runs over http protocol
Rest mainly uses json and xml as a communication language format

---------------------------------------------------------------------------------------------------------------------------------------
Rest HTTP Basics
---------------------------------------------------------------------------------------------------------------------------------------

             HTTPMETHOD                   |            CRUDOperation
             ---------                    |             -------------
             Post                         |           Create a new Entity
             Get                          |           Read a list of entities or single entity
             put                          |           Update an existing entity
             Delete                       |           Delete an existing entity 
             
             
HTTPResponse Status Codes 
-------------------------

100-199              informational
200-299              sucessfull
300-399              Rediraction
400-499              client error  //401 File not found exception
500-599              Server error

Spring Rest suport
------------------------------
Spring mvc provides support for Spring Rest 

New annotation @RestController
  . extension of the controller
  . Handles Rest requests and response 
  . Spring rest will  convert json to java pojos automatically if  as long as jackson-databind jar stays in class path 
