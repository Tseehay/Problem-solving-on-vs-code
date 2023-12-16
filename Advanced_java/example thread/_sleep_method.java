class Test _sleep_method extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        _sleep_method t= new _sleep_method();
        _sleep_method t1=new _sleep_method();

        t.start();
        t1.start();
    }
    
}
