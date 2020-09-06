package sacls;
import java.lang.Thread;
import java.util.*;

class ChildThread1 extends Thread
{
	StringBuffer sbuf;
	
	public ChildThread1(StringBuffer sbuf) {
		super();
		this.sbuf = sbuf;
	}

	@Override
	public void run()
	{
		for(int i = 1; i<= 15 ; i++)
		{
			System.out.println(i + ":" + sbuf);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyWork implements Runnable
{
	StringBuffer sbuf;
	
	public MyWork(StringBuffer sbuf) {
		super();
		this.sbuf = sbuf;
	}

	@Override
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<= 5 ; i++)
		{
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			sbuf.append(parts[0] + " ");
			
		}
		sc.close();
	}
}

public class multithrd {

	public static void main(String[] args) throws InterruptedException  {
	
		StringBuffer sbuf = new StringBuffer();
		ChildThread1 t = new ChildThread1(sbuf);
		t.start(); //will call run and return at the time
		
		MyWork workObj = new MyWork(sbuf);
		Thread t2 = new Thread(workObj);
		t2.start();
	}
}	