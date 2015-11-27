
public class task1 extends Thread{
	public task1() {
		// TODO Auto-generated constructor stub
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("task 1 :"+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
