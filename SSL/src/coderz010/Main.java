/**
 * 
 */
package coderz010;

/**
 * @author prateek
 *
 */
public class Main {

	/**
	 * constructor
	 */
	public Main() {
		// start here
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		
		SLLDepict sd = new SLLDepict();
		
		sd.addSLLBlock(12);// adds new block
		sd.addSLLBlock(9);
		sd.addSLLBlock(5);
		sd.addSLLBlock(6);
		sd.addSLLBlock(0);
		sd.addSLLBlock(12);
		sd.addSLLBlock(10);
		sd.addSLLBlock(9);
		sd.addSLLBlock(8);
		sd.addSLLBlock(7);
		sd.addSLLBlock(10);
		sd.addSLLBlock(13);
		sd.addSLLBlock(17);
		
		System.out.println("\n");
		
		sd.printSLLDepict();
		
		System.out.println("\n");
		
		System.out.println("removing greater than 5");
		
		sd.removeSLLBlock(5);// removes greater than
		
		System.out.println("\n");
		
		sd.printSLLDepict();
		
		System.out.println("\n");
		
		System.out.println("removing last block");
		
		sd.removeSLLBlock();// removes last block
		
		System.out.println("\n");
		
		sd.printSLLDepict();
		
		System.out.println("\n");
		
		System.out.println("main ended");
	}

}
