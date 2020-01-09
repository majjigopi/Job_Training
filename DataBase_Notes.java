Every table has fields which are nothing but names of the columns. Every row is called record of the table
-----------------
Select Statement : (SELECT * from <table name>)                  ---> retrives  all the values in the table 
   (SELECT <column_1>,<colume_2>, FROM <Table_Name>  ---> selects values from the specific columns all  


Distinct         :  syntax : (SELECT DISTINCT <column_1>,<colume_2> FROM <table name>)  Used to select distinct i.e unique values in a column



Where            :  syntax : SELECT <column_1>,<colume_2> from <table_name> where CountryName='UK')Where is used to select values based on certain condition 
                      
					   operators used in SQL :
					                            =        equal to operators
												<        less than 
												>        greater than
												!=       not equal to 
												=<       less than or equal to
												>=       greater than or equal to 
												Between  between a ceratain range 
												Like     used for search patterns
												IN       To specify multiple possible values for a column
												NOT      To retrive value that does't meet conditions 


                        Using Operators : 
                                           SELECT * FROM Customers	 WHERE  id BETWEEN 10 AND 2O;   i.e retrives all the values from the where id's are  between 10 and 20
                                           SELECT * FROM Customers	 WHERE  id IN  (10,2O);         i.e retrives records  which are having ids 10 and 20
                                           SELECT * FROM Customers   WHERE 	CustomerName LIKE '%S'	i.e retrives value of customers whose  names are matching with regualer expression "%s"
										   SELECT * FROM Cusotomers  WHERE  NOT Coutry = 'Geramany'   
										
										Summary : BETWEEN is used to choose the range
                                                  IN is used refer multiple values to be selected
												  Like is used to metion the matching pattern suppose like names start with "abc"
	ORDERBY      :      This sql key word is used to sort the selected values either by ASC or DESC 
                        
						Examples :  SELECT * FROM Customers   ORDER BY id;                           Sorts based on customer id
                                    SELECT * FROM Customers   ORDER BY id DESC;                      Sorts based on customer descinding order
                                    SELECT * FROM customers   ORDER BY CustomerName,id	             Sorts first based on customer Name if two coustomer names are same then it sorts based on id
                                    SELECT * FROM Customers ORDER BY Country ASC, CustomerName DESC; Sorts based on Country	 if some countries have same name then sorts in descinding order based on the Customer name								
												  
    INSERTINTO   :    this sql key word is used to insert new recoreds in to the tables 
	                   
					  Syntax : INSERT INTO <Table_Name> (<column_1>,<colume_2>,<colume_3>) VALUES (<value1>,<value2>,<value3>)
							  
							  if we are inserting all the values  in  to the table then there is no need to  mention column names remember there values should be in the order of the colums
							  
							  INSERT INTO <Table_name> VALUES (<VALUE1>,<VALUE2>,<VALUE3>,.....)
							  
	SQL NULL Values : It is not possible to test for NULL values with comparison operators, such as =, <, or <>. We will have to use the IS NULL and IS NOT NULL operators instead.

                      Syntax  : SELECT column_names FROM table_name WHERE column_name IS NULL;
					            SELECT column_names FROM table_name WHERE column_name IS NOT NULL;
							   
							   
					  Examples : SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NULL;
                                 SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NOT NULL;					  
					  
	UPDATE STATEMENT : UPDATE <TableName> <column_name1>=<value1>,<column_name2>=<value2>,<column_name3>=<value3> where condition;
	
	                   Example : UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;
					   
	DELETE STATEMENT : 
	