class MyArray{
    int [] arr;
    int count = 0;
    int index1 = 0, index2 = 0;
    public MyArray(int size){
        arr = new int[size];
    }
    public synchronized void produce(int n){
        try{
            while(count == arr.length){
                System.out.println("buffer is full "+
                        Thread.currentThread().getName()+ " is waiting");
                wait();
            }
            System.out.println(Thread.currentThread().getName()+
                    " produced " + n + " at index "+ index1);
            arr[index1++] = n;
            if(index1==arr.length)index1 = 0;
            count++;
            notify();
        }
        catch(Exception e){e.printStackTrace();}
    }
    public synchronized void consume(){
        try{
            while(count==0){
                System.out.println("buffer is empty "+
                        Thread.currentThread().getName()+ " is waiting");
                wait();
            }
            System.out.println(Thread.currentThread().getName()+" "
                + "consumed "+ arr[index2] + " from index "+ index2);
            index2++;
            if(index2 == arr.length)index2 = 0;
            count--;
            notify();
        }
        catch(Exception e){e.printStackTrace();}
    }
}
class Producer implements Runnable{
    MyArray myArray;
    public Producer(MyArray ma){myArray = ma;}
    public void run(){
        for(int i = 11; i < 40; i ++)
            myArray.produce(i);
    }
}
class Consume implements Runnable{
     MyArray myArray;
    public Consume(MyArray ma){myArray = ma;}
    public void run(){
        for(int i = 11; i < 40; i ++){
            myArray.consume();
        }
    }
}
class Test{
    public static void main(String [] args){
        MyArray ma = new MyArray(12);
        Thread t1 = new Thread(new Producer(ma));
        Thread t2 = new Thread(new Consume(ma));
        t1.start();
        t2.setPriority(10);
        t2.start();
    }
}