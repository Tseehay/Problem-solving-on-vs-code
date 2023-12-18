class Test {
    public static void main(String[] args) {
        new _sleep_method().start();
        new _sleep_method().start();
    }
}

class _sleep_method extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}