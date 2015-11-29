
public class task2 implements Runnable{

	public task2() {
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("task 2 :"+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

