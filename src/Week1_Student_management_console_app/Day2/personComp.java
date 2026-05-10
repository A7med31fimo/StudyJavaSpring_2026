package Week1_Student_management_console_app.Day2;

import java.util.Comparator;
import java.util.Objects;

public class personComp implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
    int p1 = getPriority(o1);
    int p2 = getPriority(o2);
    if(p1 != p2){
     return Integer.compare(p1,p2);
    }else{
        if(o1 instanceof Integer){
            return
                Integer.compare((int)o1,(int)o2);
        }else if(o1 instanceof String){
            return
                ((String) o1).compareTo((String) o2);

        }else if(o1 instanceof Boolean) {
            return
                Boolean.compare((boolean) o2, (boolean) o1);
        }
    }
    return 0;
    }
    public int getPriority(Object o){
     return o instanceof Integer ? 1:
            o instanceof String  ? 2:
            o instanceof Boolean ? 3:
            4;
    }
}
