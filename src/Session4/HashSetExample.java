package Session4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        List <String> values = new ArrayList<>();
        values.add ("java");
        values.add("Python");
        values.add("DotNet");
        values.add("Python");
        values.add("DotNet");

        HashSet<String> removeDuplicate = new HashSet<>();
        removeDuplicate.addAll(values);
        for(String s: removeDuplicate){
            System.out.println(s);
        }
    }

}
