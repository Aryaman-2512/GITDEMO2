import java.util.LinkedHashMap;


public class CompleteDetails {

	public void printCompleteDetails(LinkedHashMap<String, PartyDo> hashmap) {
		for (String key : hashmap.keySet()) {
		    PartyDo val = hashmap.get(key);
		    System.out.println( "The details of client with partyseq"+val.getPartySeq()+val);
		}
	}

}
