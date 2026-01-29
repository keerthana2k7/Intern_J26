package simple.HashMap;
import java.util.HashMap;

public class example {
    HashMap<Integer, String> map = new HashMap<>();
    public void addValues() {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
    }
    public void showExamples() {
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("three"));
        System.out.println(map);
    }
}
