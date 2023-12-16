class Task1 implements Runnable{
public void run(){
System.out.println("\nthread is running...");
}

public static void main(String args[]){
Thread t1 =new Thread(new Task1());
t1.start();
 }
}
