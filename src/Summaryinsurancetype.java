import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Summaryinsurancetype {

	public static void insurancetype(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What you want to search?");
		System.out.println("1.TERMINSURANCE 2.HEALTHINSURANCE");
		String input= sc.nextLine();
		if(input.equals("1"))
		{
			for(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachUser:policies.entrySet())
			{
				LinkedHashMap<String, basePolicyDo> eachUserPolicy=eachUser.getValue();
				for(Map.Entry<String, basePolicyDo> policy:eachUserPolicy.entrySet())
				{
					if(policy.getValue() instanceof terminsuranceDo)
					{
						System.out.println(policy);
					}
				
				}
			}
			
		}
		else if(input.equals("2"))
		{
			for(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachUser:policies.entrySet())
			{
				LinkedHashMap<String, basePolicyDo> eachUserPolicy=eachUser.getValue();
				for(Map.Entry<String, basePolicyDo> policy:eachUserPolicy.entrySet())
				{
					if(policy.getValue() instanceof termhealthInsurance)
					{
						System.out.println(policy);
					}
				
				}
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
