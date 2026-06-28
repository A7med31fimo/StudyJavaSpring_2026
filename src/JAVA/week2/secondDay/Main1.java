package week2.secondDay;


import java.util.*;
import java.util.regex.Pattern;
class Student{
    private String name;
    private int id;

    private String email;


    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", email='" + email + '\'' +
            '}';
    }
}
class StudentManagementSystem {

    private List<Student> students = new ArrayList<>();

    private Map<Integer, Student> studentMap = new HashMap<>();

    private Set<String> emails = new HashSet<>();

    public boolean addStudent(Student student) {

        if (studentMap.containsKey(student.getId())) {
            System.out.println("ID already exists.");
            return false;
        }

        if (emails.contains(student.getEmail())) {
            System.out.println("Email already exists.");
            return false;
        }

        students.add(student);
        studentMap.put(student.getId(), student);
        emails.add(student.getEmail());

        System.out.println("Student"+student.getName()+" added successfully.");
        return true;
    }

    public Student findStudentById(int id) {
        return studentMap.get(id);
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public boolean deleteStudent(int id) {

        Student student = studentMap.get(id);

        if (student == null) {
            System.out.println("Student with Id "+id+" not found.");
            return false;
        }

        students.remove(student);
        studentMap.remove(id);
        emails.remove(student.getEmail());

        System.out.println("Student"+student.getName()+" deleted successfully.");
        return true;
    }
}
class InputValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern NAME_PATTERN  = Pattern.compile("^[a-zA-Z\\s'-]+$");
    private static final Pattern ID_PATTERN = Pattern.compile("^[0-9]+$");

    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean isValidName(String name) {
        return name != null && NAME_PATTERN.matcher(name).matches();
    }
    public static boolean isValidId(String id) {
        return id != null && ID_PATTERN.matcher(id).matches();
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String msg) {
        super(msg);
    }
}
 class ValidedInputs{
    static void checkName(Object Name) throws InvalidInputException {
        if(!InputValidator.isValidName(Name.toString())){
            throw new InvalidInputException("Invalid Name");
        }
        IO.println("Allowed");
    }
    static void checkEmail(Object Email) throws InvalidInputException {
        if(!InputValidator.isValidEmail(Email.toString())){
            throw new InvalidInputException("Invalid Email");
        }
        IO.println("Allowed");
    }
    static void checkId(Object Id) throws InvalidInputException {
        if(!InputValidator.isValidId(Id.toString())){
            throw new InvalidInputException("Invalid Id");
        }
        IO.println("Allowed");
    }
 }
public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println("Welcome to my program Student Management System.");
        StudentManagementSystem sms =
            new StudentManagementSystem();
        while (true) {
            IO.println("1. Add Student");
            IO.println("2. Delete Student");
            IO.println("3. Display All Students");
            IO.println("0. Exit Program");
            int choice = input.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:{
                    String id = null;
                    Object name=null;
                    Object email=null;
                    int [] check = new int[]{
                        0,0,0
                    };
                    while (true) {

                        try {
                            if(check[0]!=1) {
                                IO.println("Enter Student ID");
                                id = input.next();
                                ValidedInputs.checkId(id);
                                check[0] = 1;
                            }

                            if(check[1]!=1)
                            {
                                IO.println("Enter Student Name");
                                name = input.next();
                                ValidedInputs.checkName(name);
                                check[1] = 1;
                            }
                            if(check[2]!=1) {

                                IO.println("Enter Student Email");
                                email = input.next();
                                ValidedInputs.checkEmail(email);
                                check[2] = 1;
                            }

                        break;
                        }catch (Exception e ){
                            IO.println(e.getMessage());
                        }

                    }
                    sms.addStudent(new Student(Integer.parseInt(id), (String) name, (String) email));

                }
                break;
                case 2:{
                    IO.println("Enter Student ID");
                    int id = input.nextInt();
                    sms.deleteStudent(id);
                }
                break;
                case 3:{
                    sms.displayStudents();
                }
                break;
                default:{
                    System.out.println("Invalid choice.");
                }
            }
        }
    }
}
