
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class salesdata {

	public static void salesdatafunc(
		 LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the agent id");
		 String agenti= sc.nextLine();
		 int client = 0;
		 double amount = 0;
		for(Map.Entry<String, LinkedHashMap<String, basePolicyDo>> eachuser :policies.entrySet())
		{
			LinkedHashMap<String, basePolicyDo> eachuserpolicy= eachuser.getValue();
			for(Map.Entry<String, basePolicyDo> policy:eachuserpolicy.entrySet())
			{
				if(policy.getValue() instanceof terminsuranceDo)
				{
					if(((terminsuranceDo)policy.getValue()).agentid.equals(agenti))
					{
						amount += ((terminsuranceDo)policy.getValue()).getSumAssured();
					}
					
				}
				else if(policy.getValue() instanceof termhealthInsurance)
				{
					 if(((termhealthInsurance)policy.getValue()).agentid.equals(agenti))
					{
						 amount += ((terminsuranceDo)policy.getValue()).getSumAssured();
					}
				 }
			}
		}
		
		System.out.println("The total amount by agentid "+agenti+ "is "+amount);
		
	}

}
