import java.util.LinkedHashMap;
import java.util.Scanner;


public class BuyPolicy {

	public void Buypolicyfunc(LinkedHashMap<String, PartyDo> hashmap, LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies, LinkedHashMap<String, AgentDo> agents) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a partySeq");
		String party= sc.nextLine();
		if(hashmap.containsKey(party)){
		
		
		
		System.out.println("Which policy you want to buy");
		System.out.println("1.TERMINSURANCE 2.TERMHEALTHINSURANCE");
		
	
		int n= sc.nextInt();
		if(n==1)
		{
//			terminsuranceDo terminsurance = new terminsuranceDo(party,sumassured);
////			policies.containsValue(containsKey("INSURANCE"))
//			
//		
//				policyobject.put("INSURANCE",terminsurance);
//					Policiesbuy.buyTermInsurancePolicy(policies,party);						

 	       LinkedHashMap<String, basePolicyDo> policiesuser = policies.get(party);
 	       if (policiesuser == null) 
 	       {
 	    	  policiesuser = new LinkedHashMap<String, basePolicyDo>();
 	       }
 	    
 	       if (policiesuser.containsKey("TERMINSURANCE")) {
 	           System.out.println("Party already has a Term Insurance Policy.");
 	           return;
 	       }  
 	       int policySeq = SequenceGenerator.getInstance().policySequence;
 	    
 	       System.out.print("Enter Sum Assured: ");
 	       double sumAssured = sc.nextDouble();
 	       sc.nextLine();
 	       System.out.println("Choose the agent");
 			for(String key:agents.keySet()){
 				System.out.println(key+ " :"+agents.get(key).getAgentName() );
 				
 			}
 			String agentopt = sc.nextLine();
 	       double premiumAmt = premiumCalculationDo.premiumCalTermIns(sumAssured);
 	       	      
 	       terminsuranceDo termInsurancePolicy = new terminsuranceDo(party,String.valueOf(SequenceGenerator.getInstance().policySequence),sumAssured, premiumAmt ,agentopt);
 	       policiesuser.put("TERMINSURANCE", termInsurancePolicy);
 	       policies.put(party, policiesuser);
 	       SequenceGenerator.getInstance().policySequence++;
 	      
 	       System.out.println("Term Insurance Policy added successfully.Term  Insurance Sequence is " +policySeq +" agent is "+ agents.get(agentopt).getAgentName());
 	       System.out.println(agents.get(agentopt));
			
		}
		else if(n==2){
//			termhealthInsurance termhealthinsurance = new termhealthInsurance(party,sumassured);
//				
//					
//					policyobject.put("HEALTHINSURANCE",termhealthinsurance);
//				
//			}
//	    	else{
//			
//			System.out.println("Enter valid policy choice");
//			}
//		 policies.put(party, policyobject);
//		 System.out.println("Policy bought successfully!");
			LinkedHashMap<String, basePolicyDo> policiesuser = policies.get(party);
		       if (policiesuser == null) 
		       {
		    	   policiesuser = new LinkedHashMap<String, basePolicyDo>();
		       }
		    
		       if (policiesuser.containsKey("TERMHEALTHINSURANCE")) {
		           System.out.println("Party already has a Term Health Insurance Policy.");
		           return;
		       }
		       
		       int policySeq = SequenceGenerator.getInstance().policySequence;
		    
		       System.out.print("Enter Sum Assured: ");
		       double sumAssured = sc.nextDouble();
		       sc.nextLine();
		       
	 	       System.out.println("Choose the agent");
	 			for(String key:agents.keySet()){
	 				System.out.println(key+ " :"+agents.get(key).getAgentName() );
	 				
	 			}
	 			String agentopt = sc.nextLine();
		       
		       double healthCover = sumAssured * 0.05;
		      	     
		       double premiumAmt = premiumCalculationDo.premiumCalTermHealthIns(sumAssured);
		       	      
		       termhealthInsurance termHealthInsurancePolicy = new termhealthInsurance(party,String.valueOf(SequenceGenerator.getInstance().policySequence), premiumAmt, sumAssured,healthCover,agentopt);
		       policiesuser.put("TERMHEALTHINSURANCE", termHealthInsurancePolicy);
		       policies.put(party, policiesuser); 
		       SequenceGenerator.getInstance().policySequence++;
	
		       System.out.println("Term Insurance Policy added successfully. Term Health Insurance Sequence is " +policySeq+" agent is "+ agents.get(agentopt).getAgentName());
		       System.out.println(agents.get(agentopt));
	}
		
	    else{
	    	System.out.println("Choose valid policy");
	    }
	}else{
		System.out.println("Enter valid partysequence");
	}
	}
}

		
	
		
		
	


