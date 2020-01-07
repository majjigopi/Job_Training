lamda expression are used to impliment functional interface


Types of defining of Lamda Expression 

()->{statement_1;statement_1}

()->statement_1        //if anonamous contains only single statement

(int a, int b)->System.out.println(a+b)

(a,b)-> return (a+b)   #sometime compiler can guess what type a parameter is.
 
s->return s.length     #no need of parethis if anonamous function have only one input parameter

s-> s.length           #compiler will guess in this statement like s.length has to be returned. 


if an interface contains only one abstract method then it is called functional interface

example : Interface interf
{
public void abstract m();

default void m1() //introduced in 1.8
{
}

public void static m2() //introduced in 1.8 
{
}

}

the above interface contains only one abstract method hence it is call functional interface.

Lamdas are function without names like they are anonamous functions 
They can be assigned to variable and can be used at any part of the programming
syntax (parameters )->{statements}

Lamda expressions are used to define instances of an functional interfaces.



@FunctionalInterface annotation throws error if interface does not contain any abstract method and or if interface contains
more than one abstract method

Adavantages of lamda expression 
------------------------------------------
we can start using functional programming in java
we can reduce the length of the code
we can pass function as argument to the method
can pass prcedure or funcions as argument
enble or support parlell processing






