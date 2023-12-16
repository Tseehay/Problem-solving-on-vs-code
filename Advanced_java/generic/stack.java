import java.util.*;

public class stack{
public static void main(String[] args) { 
    Stack<String> stack=new Stack<String>();
    stack.push("SoEEC");
    stack.push("SoMMCE");
    stack.push("SoCEA");
    stack.push("SoANC");
    stack.push("SoHSS");
    stack.pop();
    Iterator<String> itr=stack.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}

}