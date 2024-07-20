
public class SequenceGenerator {
    private static SequenceGenerator SeqInstance;
     int currentPartySequence;
     int currentAddressSequence;
     int currentContactSequence;
     int policySequence;

    private SequenceGenerator() {
    	currentPartySequence = 1; 
    	currentAddressSequence=1;
    	currentContactSequence=1;
    	policySequence =1;
    }

    public static SequenceGenerator getInstance() 
    {
        if (SeqInstance == null) 
        {
        	SeqInstance = new SequenceGenerator();
        	return SeqInstance;
        }
        else
        {
           /* SeqInstance.currentPartySequence++;
        	SeqInstance.currentAddressSequence++;*/
        	return SeqInstance;
        }
    }
        
    }