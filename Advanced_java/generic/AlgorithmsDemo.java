import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class AlgorithmsDemo {
    public static void main(String[] args) {
    
        LinkedList ll =new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));

        Comparator r= Collections.reverseOrder();
        Collections.sort(ll,r);

        Iterator itr= ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

        Collections.shuffle(ll);

        itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");

        }
        System.out.println(Collections.min(ll));
    }
}