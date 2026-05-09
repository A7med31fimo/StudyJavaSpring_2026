package Week1_Student_management_console_app.Day1;

import java.util.Objects;

;
public class student {
    private String name;
    private String email;
    private int    id;
    private int age;
    private Class_lvl class_lvl_level;

    public student(String name, String email,int id, int age, Class_lvl class_lvl_level) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
        this.class_lvl_level = class_lvl_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class_lvl getClass_level() {
        return class_lvl_level;
    }

    public void setClass_level(Class_lvl class_lvl_level) {
        this.class_lvl_level = class_lvl_level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return getId() == student.getId() && getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && Objects.equals(getEmail(), student.getEmail()) && getClass_level() == student.getClass_level();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getId(), getAge(), getClass_level());
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", class_lvl_level=" + class_lvl_level +
                '}';
    }
}
