class Task1 implements Runnable{
    public void run(){
        System.out.println("\n Threading is Running");
    }


public static void main(String args[]){
Thread t1 =new Thread(new Task1());
t1.start();
 }
}
