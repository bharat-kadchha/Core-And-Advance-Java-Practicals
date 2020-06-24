package leb_2.threading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		
		display display=new display();
		NameThread thread=new NameThread(display,"ravi");
		NameThread thread1=new NameThread(display,"raj");
		
	}
}

class NameThread extends Thread
{

	display display;
	String name;
	Thread thread;
	NameThread(display display,String name) {
	
		this.display=display;
		this.name=name;
		thread=new Thread(this);
		thread.start();
		
	}
	public void run() {
	
		display.wish(name);
	}
}
class display
{
	public synchronized void wish (String name)  
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.print("good morning :");
			try 
			{
				Thread.sleep(1500);
			} 
			
			catch (InterruptedException e) 
			{
				
			}
			System.out.println(name);
			
			
			
		}
		
	}
}