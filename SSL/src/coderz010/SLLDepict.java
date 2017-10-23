/**
 * 
 */
package coderz010;

/**
 * @author Prateek
 *
 */
public class SLLDepict {

	
	/* block SLLDepict*/
    class SLLBlock {
        int blockData;
        SLLBlock blockAhead;
        
        SLLBlock (int bData)  {
        	blockData = bData;
        	blockAhead = null;
        }
        
        void printSLLBlockData() {
        	System.out.println(blockData);
        }
    }
    
    private SLLBlock firstBlock = null;
    private SLLBlock lastBlock = null;
    
	/**
	 * constructor
	 */
	public SLLDepict() {
		// start here
		
		
	}
	
	public void addSLLBlock(int blockData) {
		SLLBlock sllB = new SLLBlock(blockData);
		sllB.blockAhead = null;
		if(firstBlock == null) {
			lastBlock = firstBlock = sllB;
		}
		else {
			lastBlock.blockAhead = sllB;
			lastBlock = sllB;
		}
	}
	
	public void removeSLLBlock() {
		if (lastBlock == null)
	            return;
		else {
			if (firstBlock == lastBlock) {
				lastBlock = firstBlock = null;
			} else {
				SLLBlock sslB = firstBlock;
				while (sslB.blockAhead != lastBlock) {
					sslB = sslB.blockAhead;
				}
				lastBlock = sslB;
				lastBlock.blockAhead = null;
			}
		}
	}
	
	public void removeSLLBlock(int greaterThan) {
		SLLBlock sllB = firstBlock;
		SLLBlock before = null;
		while(sllB != null) {
			if(sllB.blockData > greaterThan) {
				if(sllB == firstBlock) {
					firstBlock = sllB.blockAhead;
				} else if(sllB.blockAhead == null) {
					before.blockAhead = null;
				} else {
					before.blockAhead = sllB.blockAhead;
				}
				sllB = sllB.blockAhead;
			} else {
				before = sllB;
				sllB = sllB.blockAhead;
			}
		}
		lastBlock = before;
	}
	
	
	public void printSLLDepict() {
		SLLBlock sllB = firstBlock;
		while(sllB != null) {
			sllB.printSLLBlockData();
			sllB = sllB.blockAhead;
		}
	}

}
