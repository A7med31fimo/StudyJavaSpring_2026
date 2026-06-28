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
         3- make the ref of parent refer to child obj as following
             Animal a = new Dog();
             a is ref type store in stack mem
             new Dog() create obj  in heap mem
             when create ref from parent the constructor of parent call first (Animal)
             then constructor of child (Dog)
             then method (sound)
             and the sound method call from class which obj created from it.
             a.sound();
      ***************************************************************************
      #4 Abstraction
         1- the main goal is hide every thing in class method (implementation details)
         2- show only the important parts only like headers of func's (behavior)
         3 some important concepts achieved after work with abstract
            1- Simplicity
            2- Reduced Information Overload (don't dive in useless details just focus on important)
            3- Maintainability & Flexibility
            4- Code Reusability (by interface or abstract we can create good templates and use it)
            5- Reducing Redundancy
         4- abstract class can have some methods implementation not just abstract
         5- single inheritance
       ******************************************************************************
       #5 Interface
          1- Interface is Contract
             Any class inherit it -> should implement all methods of it
          2- fully abstraction
          3- java support multiple inheritance

*/


public class Explantion_oop_concepts {
}
