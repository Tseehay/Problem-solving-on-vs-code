import java.util.*;

public class vector1{
    public static void main(String[] args){
        Vector<String> vec=new Vector<String>();
        vec.addElement("L");
        vec.addElement("O");
        vec.addElement("V");
        vec.addElement("E");
        vec.addElement(" ");
        vec.addElement("U");
        System.out.println("vectors: "+ vec);
        System.out.println("Size vectors: "+ vec.size());
        System.out.println("Frist element vectors: "+ vec.firstElement());
        System.out.println("Last element vectors: "+ vec.lastElement());
        System.out.println("2nd index element vectors: "+ vec.elementAt(2));
        vec.removeElementAt(2);
        System.out.println("result vectors: "+ vec);
    }


}