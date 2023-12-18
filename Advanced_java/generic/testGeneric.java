public class testGeneric {
    public static void main(String args[]){
            MyGen<T> g1=new MyGen<T>();
            g1.add(2);
            //g1.add("CSE");//Compile time error  
            System.out.println(g1.get());
    }
}

