class testpriority extends Thread {
    public void run(){
        System.out.println("running name: "+ Thread.currentThread().getName());
        System.out.println("running therad priority: "+Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        testpriority t=new testpriority();
        testpriority t1=new testpriority();
        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t1.start();
    }

}
