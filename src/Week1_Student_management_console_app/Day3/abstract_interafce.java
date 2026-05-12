
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void sleep() {
        System.out.println("Sleeping");
    }
}
 class Dog extends Animal{

     Dog(String name) {
         super(name);
     }

     @Override
    void sound() {
        IO.println("Child");
    }

}
void main() {
    Dog d = new Dog("dog");

//    d.sound();

}
