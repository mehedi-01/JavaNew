package Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass {


    List<String> list = new ArrayList<>();
    public void rt ()
    {
        list.add(null);
        list.add("Joy");
        System.out.println(list !=null ? list : new ArrayList<>());
    }

}


