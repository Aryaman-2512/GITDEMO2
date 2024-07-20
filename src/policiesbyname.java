import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class policiesbyname {

	public static void policiesname(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Name for policies: ");
    	String partyName = sc.nextLine();
    	
    	for(Map.Entry<String, PartyDo> user: hashmap.entrySet())
    	{
    		PartyDo eachuser = user.getValue();
    		if(eachuser.getFirstName().equals(partyName))
    		{
    			String partyseq = eachuser.getPartySeq();
    			 LinkedHashMap<String, basePolicyDo> policiesuser = policies.get(partyseq);
    			 if(policiesuser==null || policiesuser.isEmpty());
    		       {
    		    	   System.out.println("No policy");
    		       }
    		       System.out.println("Policy for party sequence" +partyseq + ":");
    		       for(Map.Entry<String,basePolicyDo> entry : policiesuser.entrySet())
    		       {
    		    	   basePolicyDo policy = entry.getValue();
    		       if(policy instanceof terminsuranceDo)
    		       {
    		    	   terminsuranceDo terminsurance = (terminsuranceDo) policy;
    		    	   System.out.print(terminsurance);
    		       }
    		       else if(policy instanceof termhealthInsurance)
    		       {
    		    	   termhealthInsurance termhealthinsurance = (termhealthInsurance) policy;
    		    	   System.out.print(termhealthinsurance);
    		       }
    		       }
    		}
    		else{
    			System.out.println("Name not found");
    		}
    	}
       
      
      
		
	}

}
