package chapter02.BeTheCompiler;

public class DVDPlayer {
	boolean canRecord = false;
	
	void recordDVD() {
		System.out.println("DVD recording");
	}
	
	void playDVD() { //this method was missing in the example.
		System.out.println("DVD playing");
	}
}

class DVDPlayerTestDrive {
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}

