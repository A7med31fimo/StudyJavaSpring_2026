package week3.day1;

import java.util.Arrays;

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
        Arrays.stream(test.getT()).forEach((e)->(System.out.print(e+" ")));
    }
}
