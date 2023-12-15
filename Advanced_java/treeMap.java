import java.util.*;
public abstract class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<Integer,String>();
        map.put(1,". SE");
        map.put(2,". CSE");

        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
