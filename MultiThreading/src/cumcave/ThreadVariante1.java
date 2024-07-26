package cumcave;

public class ThreadVariante1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
			try {
				Thread.sleep(100); // aktueller Thread für 100ms schlafend
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
