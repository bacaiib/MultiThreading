package cumcave;

public class Program {

	public static void main(String[] args) {
		System.out.println("Main-Methode Start");
		
		// synchroner Nachrichten-Aufruf/Methoden-Aufruf
		//new Test().testMethode();
		
		// asychrone Nachrichten
		// Thread Variante 1 mit Interface Runnable
		Thread fred1 = new Thread(new ThreadVariante1());
		Thread fred2 = new Thread(new ThreadVariante1());
		fred1.setName("Fred 1");
		fred2.setName("Fred 2");
		fred1.setPriority(Thread.MIN_PRIORITY);
		fred2.setPriority(Thread.MAX_PRIORITY);
		fred1.start();
		fred2.start();
		//fred1.start(); Ein Thread kann nicht neu gestartet werden
		
		if(fred1.isAlive()) {
			System.out.println("Ja er lebt noch");
		}else {
			System.out.println("Fred ist gestorben");
		}
		
		try {
			fred1.join();
			fred2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(fred1.isAlive()) {
			System.out.println("Ja er lebt noch");
		}else {
			System.out.println("Fred ist gestorben");
		}
		
		// Thread Variante 2 mit Erweiterung der Thread-Klasse (extends Thread)
		//ThreadVariante2 superFred3 = new ThreadVariante2("Super Fred 3");
		ThreadVariante2 megaFred4 = new ThreadVariante2("Mega Fred 4");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//megaFred4.stop(); // Veraltet/Deprecated
		//megaFred4.interrupt(); // Thread wird hier unterbrochen und im catch-Block beendet
		
		// Thread Variante 3
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("wird vom Thread ausgeführt");
			}
		}).start();
		
		
		System.out.println("Main-Methode Ende");
	}
	
	
		
}

class Test{
	
	public void testMethode() {
		System.out.println("synchrone Methode");
	}
	
}
