
//example of java synchronized method  
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread_1 extends Thread{  
Table t;  
MyThread_1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread_2 extends Thread{  
Table t;  
MyThread_2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class Synch1{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread_1 t1=new MyThread_1(obj);  
MyThread_2 t2=new MyThread_2(obj);  
t1.start();  
t2.start();  
}  
} 
