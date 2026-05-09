package Week1_Student_management_console_app.Day1;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Std_mangement{


        void main() {
            Student_mangement sm = new Student_mangement();

            Scanner sc = new Scanner(System.in);
            int cnt_id = 1;
            while (true) {
                IO.println("Enter Your Options from below : ");
                IO.println("For add std enter 1 : ");
                IO.println("For delete std enter 2 : ");
                IO.println("For Print all stds enter 3 : ");
                int answer = sc.nextInt();
                sc.nextLine();
                switch (answer) {
                    case 1: {
                        IO.println("Enter Your Name : ");
                        String name = sc.nextLine();
                        IO.println("Enter Your email : ");
                        String email = sc.nextLine();
                        int id = cnt_id++;
                        IO.println("Enter Your age : ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        IO.println("Enter Your Class Level From below : ");
                        for (Class_lvl c_lvl : Class_lvl.values()) {
                            IO.println("if you " + c_lvl + "select " + c_lvl.getLevel());
                        }
                        int class_lvl = sc.nextInt();
                        sc.nextLine();
                        Class_lvl c = switch (class_lvl) {
                            case 1 -> Class_lvl.First;
                            case 2 -> Class_lvl.Second;
                            case 3 -> Class_lvl.Third;
                            default -> Class_lvl.Fourth;
                        };
                        student std = new student(name, email, id, age, c);
                        sm.addStudent(std);
                        break;
                    }
                    case 2: {
                        IO.println("select id of user you need to delete it : ");
                        sm.PrintAllStds();
                        int id = sc.nextInt();
                        sc.nextLine();
                        sm.delete(id);
                        break;
                    }
                    default:
                        sm.PrintAllStds();
                        break;
                }
                IO.println("Do You need Exit ? yes : no");
                String ans = sc.nextLine();
                if (Objects.equals(ans, "yes")) {
                    break;
                }
            }
        }
}