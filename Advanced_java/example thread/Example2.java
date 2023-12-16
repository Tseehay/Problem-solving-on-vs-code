class Task2 extends Thread{
public void run(){
System.out.println("thread is running...");
}

public static void main(String args[]){
Task2 t1 =new Task2();
t1.start();
 }
}
