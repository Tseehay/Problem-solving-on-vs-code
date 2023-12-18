
import java.util.ArrayList;

public class testGeneric {
    public static void main(String args[]){
            MyGen<Integer> g1=new MyGen<Integer>();
            g1.add(2);
            //g1.add("CSE");//Compile time error  
            System.out.println(g1.get());
    }
}

class MyGen<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public T get() {
        return list.get(0);
    }
}