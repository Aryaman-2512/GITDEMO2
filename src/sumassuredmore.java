import java.util.LinkedHashMap;
import java.util.Map;


public class sumassuredmore {

	public static void sumass(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		// TODO Auto-generated method stub
		
		 for (Map.Entry<String, LinkedHashMap<String, basePolicyDo>> firstEntries : policies.entrySet()) {
	            LinkedHashMap<String, basePolicyDo> hashMap = firstEntries.getValue();
	            for (Map.Entry<String, basePolicyDo> newEntries : hashMap.entrySet()) {
	            	basePolicyDo policy = newEntries.getValue();

	                double sumAssured = 0;
	                if (policy instanceof terminsuranceDo) {
	                    sumAssured += ((terminsuranceDo) policy).getSumAssured();
	                } else if (policy instanceof termhealthInsurance) {
	                    sumAssured += ((termhealthInsurance) policy).getSumAssured();
	                }

	                if (sumAssured > 10000000) {
	                    String userId = firstEntries.getKey();
	                    PartyDo user = hashmap.get(userId);
	                    System.out.println("User: " + user + ", Sum Assured: " + sumAssured);
	                }
	            }
	        }

		
	}

}
