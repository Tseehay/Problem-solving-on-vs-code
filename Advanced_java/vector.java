import java.util.*;
public class vector{
    public static void main(String[] args){
        vector<String> v= new vector<String>();
        v.add("same");
        v.add("sam");
        v.add("sme");
        v.add("ame");
        v.add("me");  
        Iterator<String> iter=v.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}

