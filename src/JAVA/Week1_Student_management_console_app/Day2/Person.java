package Week1_Student_management_console_app.Day2;

public class Person implements Comparable<Person> {
 private String name;
 private String email;
 private int id;

    public Person(String name,String email,int id){
     this.name = name;
     this.email = email;
     this.id = id;
 }
 @Override
     public int compareTo(Person p){
     return Integer.compare(this.id,p.id);
 }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
