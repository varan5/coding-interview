package com.company.oop;

class Person //entity
{
 //data members
 int age;
 String name;

 //object initializer : constructor
 Person()//default constructor
 {
   System.out.println("Person()");
   age = 0;//assign preset value
   name = "Baby";//assign preset value
 }

 Person(int a, String n)//parameterized constructor
 {
   System.out.println("Person(int, String)");
   age = a;//assign parameter value
   name = n;//assign parameter value
 }

 //operations
 void display(/* this */)
 {
  //are there local variables named: name,age
  //yes: use them
  //no: treat them as this.name, this.age
  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
 }

 public static void main(String args[])
 {
  //Being a datatype the class Person will be used through instantiation

  System.out.println("----------------");
   Person p1 = new Person();//Object created without data, hence initialized by the default constructor
  System.out.println("----------------");
   Person p2 = new Person(10, "Anil");//Object created with data, hence initialized by the parameterized constructor
  System.out.println("----------------");
   p1.display();
   p2.display();

 }
}
