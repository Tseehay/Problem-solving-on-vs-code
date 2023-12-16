import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class AlgorithmsDemo() {
    public static void main(String[] args) {
    
        LinkedList ll =new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));

        Comparator r= collections.reverseOrder();
        collections.sort(ll,r);

        Iterator itr= ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

        collections.shuffle(ll);

        itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");

        }
        System.out.println(collections.mins(ll));
    }

    
}


