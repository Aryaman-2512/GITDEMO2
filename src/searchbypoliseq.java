import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class searchbypoliseq {

	public static void poliseq(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter policy seq: ");
    	String poliseq = sc.nextLine();
    	
    	for(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachUser:policies.entrySet())
		{
    		String s = eachUser.getKey();
			LinkedHashMap<String, basePolicyDo> eachUserPolicy=eachUser.getValue();
			for(Map.Entry<String, basePolicyDo> policy:eachUserPolicy.entrySet())
			{
				if(policy.getValue() instanceof terminsuranceDo)
				{
					terminsuranceDo insur = (terminsuranceDo)policy.getValue();
					if(insur.getPolicyseq().equals(poliseq))
					{
						PartyDo p = hashmap.get(s);
						System.out.println(p);
						System.out.println(insur);
						
					}
				}
				if(policy.getValue() instanceof termhealthInsurance)
				{
					termhealthInsurance insur = (termhealthInsurance)policy.getValue();
					if(insur.getPolicyseq().equals(poliseq))
					{
						PartyDo p = hashmap.get(s);
						System.out.println(p);
						System.out.println(insur);
						
					}
				}
			
			}
		}
}}
