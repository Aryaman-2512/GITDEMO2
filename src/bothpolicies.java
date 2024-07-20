import java.util.LinkedHashMap;
import java.util.Map;


public class bothpolicies {

	public static void bothpolicy(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		// TODO Auto-generated method stubfor(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachUser:policies.entrySet())
		 for (Map.Entry<String, LinkedHashMap<String, basePolicyDo>> policyTypeEntry : policies.entrySet()) {
	            String partyseq = policyTypeEntry.getKey();
	            
	            LinkedHashMap<String, basePolicyDo> policiesp = policyTypeEntry.getValue();
	            if (policiesp.containsKey("TERMINSURANCE") && policiesp.containsKey("TERMHEALTHINSURANCE")) {
	                System.out.println("PartySeq with both policies: " + partyseq);
	            }
	        }

	}

}
