package Week1_Student_management_console_app.Day3;
/* # OOP basic explanation
      oop make the code organized and easy understand,edit and upgrade projects
      using classes (blueprint) and objects
      class have variables -> fields / attributes
      object is copy from class\
      when we say Employee e1 = new Employee(); e1-> is ref var book object in heap memory
      e1 is store in stack , actual object store in heap memory
******************************************************************************************
     #1 Encapsulation
          Main goal hide data and protect it by following steps
             1- make vars are private
             2- create getter and setter
     ************************************************************
     #2 Inheritance
          Main goal reuse the code don't repeat any method or class
          use IS - A relation
            like  Dog IS-A Animal:
            public class Animal {
                void eat() {
                System.out.println("Eating");
                }
            }
            public class Dog extends Animal {
                 void bark() {
                System.out.println("Barking");
                 }
            }
      *************************************************************
      #3 Polymorphism
         1- allows objects to behave differently based on their specific class type.
          The word polymorphism means having many forms,
          and it comes from the Greek words poly (many) and morph (forms) -->override
         2- Runtime polymorphism, or dynamic method dispatch,
          is an Object-Oriented Programming (OOP) concept
          where a method call is resolved at runtime rather than compile time
         3- make the ref of parent refer to child obj
*/


public class Employee {
}
