@component annotation is used to register java bean in spring container. In this exmaple  Springconfig.xml consists
of <context:component-scan base-package="package name"/> to let tha spring know where to search for spring componets
@component is placed on the top of the class to let the spring know  which class object need to be created 
@component("beanid")  string in the brackets is the bean id which is uesd to get object of a class

classpathxmlapplicationcontext context= new classpathaxmlapplicationContext("SpringConfig.xml");

context.getBean("Beanid"); here we will use bean id. if we did not specify beanid in the component annotation 
suppose  we declare component scan like this ]
@componet for class TennisCoach then spring provides a defauld id like this "tennisCoach"

@Autowired can be used to inject bean in to setter method.


private FortuneService fortuneService;

@Autowired
Ex: poblic void setFortuneService(FortuneService fortuneService)
{

this.fortuneService=frotuneService;
}

