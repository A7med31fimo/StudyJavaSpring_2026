

public  class Animal{

    public Animal(){
        IO.println("Paranet constructor");
    }
    public void sound() {
        IO.println("animal sound");
    }


    public void parentMethod() {
        IO.println("hi");
    }
}
public  class Dog extends Animal{

    public Dog(){
        IO.println("Child constructor");
    }
    @Override
    public void sound() {
        IO.println("dog sound");
    }
    public void run(){
        IO.println("child");
    }
}

public void main() {
  Animal a = new Dog();
  a.parentMethod();
    ((Dog)a).run();
}
