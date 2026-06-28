package Week1_Student_management_console_app.Day1;

import java.util.ArrayList;

public class Student_mangement {
    ArrayList<student> students;

    public Student_mangement(){
        students = new ArrayList<student>();
    }

    public void addStudent(student s){
        this.students.add(s);
        IO.println("Added Successfully"+s.toString());
    }
    public void delete(int id){
        student std = students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
        if(std != null) {
            this.students.remove(std);
            IO.println("Deleted Successfully" + std.toString());
        }else{
            IO.println("This std not found");
        }
    }


    public void PrintAllStds() {
        for(student std:students){
           IO.println(std.toString());
       }
    }
}
