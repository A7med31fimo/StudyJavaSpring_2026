package Week1_Student_management_console_app.Day2;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>(
                List.of("atg", 12, "hguy", 34, 89, true, false, "abc", 5,true,false,true,80)
        );
        list.sort(new personComp());
//   List<Person> list = new ArrayList<>();
//        list.add(new Person("ahemd","agf@email.com",1));
//        list.add(new Person("ahemd","agf@email.com",3));
//        list.add(new Person("ahemd","agf@email.com",2));
//        list.add(new Person("ahemd","agf@email.com",54));
//        list.add(new Person("ahemd","agf@email.com",8));
//        Collections.sort(list);
        for (var e : list) {
            System.out.println(e.toString());
        }
    }
}
