package week3.day1;
/*
importance of generics
1- type safety
2- no casting
3 compile time checking







 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test<T>{
    private T[] t;

    public T[] getT(){
        return t;
    }
    public void setT(T[] t){
        this.t =t;
    }

    @Override
    public String toString() {
        return "Test{" +
            "t=" + Arrays.toString(t) +
            '}';
    }
}

public class genrics {
    public static void main(String[] args) {
        Test<Integer> test=new Test<>();
        test.setT(new Integer[]{1,2,3,4,5});
//        Arrays.stream(test.getT()).forEach(System.out::println);
        ArrayList list = new ArrayList();

        list.add("Ahmed");
        list.add(10);

        String name = String.valueOf(list.get(1));
        IO.println(name);
    }
}
