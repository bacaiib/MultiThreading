package cumcave;

public class ThreadVariante2 extends Thread{
	
	public ThreadVariante2(String name) {
		//super.setDaemon(true); // beendet den Thread sobald die Anwendung(Hauptthread) beendet wurde
		super.setName(name);
		super.start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
			try {
				Thread.sleep(100); // aktueller Thread für 100ms schlafend
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				i = 100; // aktuelle Aufgabe beenden, abschließenden Arbeiten ausführen und beenden
				
			}
			
		}
	}

}
