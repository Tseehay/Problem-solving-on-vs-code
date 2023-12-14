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
        System.out.println("vetors: "+ vec);
        System.out.println("Size vetors: "+ vec.size());
        System.out.println("Frist element vetors: "+ vec.firstElement());
        System.out.println("Last element vetors: "+ vec.lastElement());
        System.out.println("2nd index element vetors: "+ vec.elementAt(2));
        System.out.println("remove element vectors: "+ vec.removeElement(2));
    }


}