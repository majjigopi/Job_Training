Entity class: java class that is mapped to DataBase Table

What are three states of Hiberanate 
1) Transient 
  
    An object which is not associated with hibernate session and does not represent a row in the database is considered as transient. 
2) persistent
   after attaching to hibernate is called persistent state  
3) Deatached
  if we remove object from hiberante then it is called detached object
4) Perameanent  state
   if the hibernate object is stored in the database it is called permeanent state

Annotations 
------------
@Entity used to annoatate the class which is used for data base table mampping
@Id      used to indicate the primery coulumn in th table 
@column(name ="xxx") is used to map java field to data base table column name
@Table(name="xxx")  is class level annotation to indicate table name to which the  class being mapped

@GeneratedValue(strategy=GenarationType.IDENTITY) is used for deciding strategy for generating unique value for primary key. Genaration.IDENTITY is used to say to hibernate that please leave genaration of value to Data base

There are different generation types read for clarity

How to Generate custom primary key values using hiberanate
ans: Although we can crate a custom primary key unique ids using data base sql statements. we can also generate by using hibernate
      three two  steps to fallow
      Create an Implementation for org.hibernate.id.IdentifierGenerator and overide method public serializable generate();
      

Two Important classes in Hiberante
-----------------------------------
"SessionFactory" it is a class . It reads Hibernate configuration file.  creates session objects. It is a heavy   
weight object . create only once 
"Session" wraps a jDBC connection. Main object used to save and retrieve objects. It is a short lived object. Retrieved from session factory


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


