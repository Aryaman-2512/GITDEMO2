import java.util.LinkedHashMap;
import java.util.Map;


public class Updatepremium {

	public void premium(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		for(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachUser:policies.entrySet())
		{
			LinkedHashMap<String, basePolicyDo> eachUserPolicy=eachUser.getValue();
			for(Map.Entry<String, basePolicyDo> policy:eachUserPolicy.entrySet())
			{
				if(policy.getValue() instanceof terminsuranceDo)
				{
					((terminsuranceDo)policy.getValue()).setPremiumAmt(((terminsuranceDo)policy.getValue()).premiumAmt*5/100+((terminsuranceDo)policy.getValue()).premiumAmt);
				}
				else if(policy.getValue() instanceof termhealthInsurance)
				{
					((termhealthInsurance)policy.getValue()).setPremiumAmt(((termhealthInsurance)policy.getValue()).premiumAmt*7/100+((termhealthInsurance)policy.getValue()).premiumAmt);
				}
			}
		}
		
	}

}
