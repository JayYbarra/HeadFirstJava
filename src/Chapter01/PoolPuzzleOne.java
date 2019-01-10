package chapter01;

public class PoolPuzzleOne {
	public static void main(String [] args) {    
		int x = 0;    
		
		while (x < 4) {      
			System.out.print("a"); // this prints as long as x is less than 4
			
			if ( x < 1 ) {        
				System.out.print(" ");    
			}      
		
			System.out.print("n"); // no matter what x is, this gets printed
			
			if (x > 1) {  // not greater than 1 yet        
				System.out.print(" oyster");       
				x = x + 2;
			} 
			
			if ( x == 1 ) { // x is still zero for now
				System.out.print("noys");
				}
			
			if (x < 1) { // since x is zero, this will get printed 
				System.out.print("oise");     
			}
			
			System.out.println(""); // starts a new line     
			x = x + 1;    
		}   
	}
}
