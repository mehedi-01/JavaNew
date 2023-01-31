package array_demo;

import java.util.ArrayList;
import java.util.List;

public  class Person {

   private List<String> names = new ArrayList<>();

    public Person() {
        this.names.add("ROny");
        this.names.add("ROny1");
        this.names.add("ROny2");
        this.names.add("ROny3");
    }

    public List<String> getNames() {
        return names;
    }
}
 