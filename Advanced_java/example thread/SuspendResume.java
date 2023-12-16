class MyThread extends Thread {
boolean active = true;
public void Suspend()
	{ 
	active=false; 
	}
public synchronized void Resume() 
	{
	active = true;
	notify();
	}
public synchronized void run() {
	try {
	while(true) {
	if(active) {
	System.out.println("Running...");
	Thread.sleep(500);
	}
else {
	System.out.println("Suspended...");
	wait();
	}
}
}catch(Exception e) {e.printStackTrace();}
}
}
public class SuspendResume {
public static void main(String args[]) throws Exception {
MyThread mt = new MyThread();
mt.start();
while(true) {
Thread.sleep(1000);
mt.Suspend();
Thread.sleep(1000);
mt.Resume();
}
}
}