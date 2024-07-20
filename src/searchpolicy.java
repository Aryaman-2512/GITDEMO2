import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class searchpolicy {

	public void searchPolicy(
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies,
			LinkedHashMap<String, PartyDo> hashmap) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter Party Sequence: ");
	    	String partySeq = sc.nextLine();
	    
	       PartyDo party = hashmap.get(partySeq);
	       if (party == null) 
	       {
	           System.out.println("Party not found.");
	           return;
	       }
	       LinkedHashMap<String, basePolicyDo> policiesuser = policies.get(partySeq);
	       if(policiesuser==null || policiesuser.isEmpty());
	       {
	    	   System.out.println("No policy");
	       }
	       System.out.println("Policy for party sequence" +partySeq + ":");
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

}
