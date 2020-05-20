Create student demo : this class is for inserting java pojo objects in to the data base
PrimaryKeyDemo      : this class is for how hibernate manages to primary key in the data base
Read Student Demo   : this calls is for how to read a database object in to java pojo class
StudentEntity       : this class tells how to map java object to data base object 

Entity Class : Java class that is mapped to database table 

@Entity //is used to indicate hibernate that we are using this class to  map database table
@Table(name="Student")// This   annotation allows you to specify the details of the table that will be used to persist the entity in the database. 
public class student
{

@Id //This annotation is used to indicate primary key in the database table that is being mapped to java data member 
@Column(name = "id") // this is used to mention the column name  that is being mapped to java data member
private int id  // if the name of variable is same as column name then there is no need to 
                // mention name of the column

@Column(name ="first_name")                
private  String first_Name



}

lets discuss two class name 
 SessionFactory : Reads the hibernate configuration files create session object. heavy wieght objects only create once in your app 
 Session  : wraps a jdbc connection . this object is  retrived from SessionFactory . it is  a short lived object. it is used save and retrive java object in to the database   
 
 see create StudentDemo class to know how to use the above classes
 
 @GenerationStrategy this annotation is used to specify database column that how to generate auto incrimental value or unique value to that column

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT, // auto incerement strategy specifying while creating table if we dont like database generation strategy we can mention in hibernate @GenerationStrategy
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 

@GenerationStrategy(strategy = GenerationType.Identity) ;GenerationType.Identity leaves incrimental strategy to database 

simlary look after GenerationType.Sequence,GenerationType.Auto,GenerationType.Table


if we want use our own strategy if we dont like above generation strtagies we can impliment org.hibernate.id.IdentifierGenerator and overide method public serializable generate(); and wrote the java code to generate a unique id and return that value 
 
 
 Read the objects from the database :
 -----------------------------------
 
 look at ReadStudentDemo  in com.lov2code.hibernate.Demo.Entity package
 
 
 up to now we know how to insert data into database now we have to know  querying the database this can be done by HQL hibernate query language  
 
 HQL language :
  
  in order query a database throug hibernate remevoe select * from every query statement
  
  suppose if we want to get all students entites then HQL statement will be "from students"
  
  like that some of HQl statement's will be 
  "from students where last_Name ="Doe""
  "from students where last_Name  like %g"
  
  see querystudentdemo class to know practical example
  
  
  updating table in database using hibernate : 
  ------------------------------------------
  
  