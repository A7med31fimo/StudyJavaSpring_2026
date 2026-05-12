// Example 1
public interface IFlyable{
    abstract void fly();
}
public interface ISwimmable{
    abstract void swim();
}
public class Duck implements IFlyable,ISwimmable{
    public void fly(){
      IO.println("can fly");
    }
    public void swim(){
      IO.println("can swim");
    }
}


//Example 2

class MySQLDatabase {
    void connect() {
        System.out.println("MySQL Connected");
    }
}

class UserService1 {
    MySQLDatabase db = new MySQLDatabase();

    void start() {
        db.connect();
    }
}
//here if i changed my db to another db like ,I need to change to (PostgreSQL)
//i am necessary need to change in user service (tight coupling )


interface DataBase{
    void connect();
}
class mysql implements DataBase{
    public void connect(){
        IO.println("mysql is connected");
    }
}
class postgrl implements DataBase{
    public void connect(){
        IO.println("postgrl is connected");
    }
}

class UserService {
    DataBase db;
    UserService(DataBase db){
        this.db = db;
    }
    void run(){
        db.connect();
    }
}

void main() {
//    Duck d = new Duck();
//    d.fly();
//    d.swim();
    DataBase db = new mysql();
    DataBase db2 = new postgrl();
    UserService service = new UserService(db2);
    service.run();
}
// so the interface make us don't depend on concrete class but depend on interface (SOLID principles -> Dependency Inversion Principle (DIP))

