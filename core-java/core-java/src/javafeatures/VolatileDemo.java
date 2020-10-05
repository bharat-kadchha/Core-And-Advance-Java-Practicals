package javafeatures;

public class VolatileDemo {
	
	Thread t = new Thread(new MyRunnable());
	
}


class MyRunnable implements Runnable {
	   private volatile boolean active;
	   public void run() {
	      active = true;
	      while (active) {    
	      }
	   }
	   public void stop() {
	      active = false;  
	   }
}
