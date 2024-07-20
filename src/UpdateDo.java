import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class UpdateDo {

	public void updatepartDo(LinkedHashMap<String, PartyDo> hashmap, LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		 boolean update= false;
		while(true){
		
		System.out.println("Please enter the party sequence Number to be updated");
		Scanner sc =  new Scanner(System.in);
		String upd= sc.nextLine();
		
		if(hashmap.containsKey(upd))
		{  
			
			
			PartyDo downl = hashmap.get(upd);
			while(true){
			boolean isvalidconttype = false;
			System.out.println(downl);
		
			System.out.println("What Do you want to update");
			System.out.println("1.Basic \n2.Address \n3.Contact \n4.Premium");
			String conttypeinput = sc.nextLine();
			 if("1".equals(conttypeinput))
			    {
				 BasicInfoUpdate.basicupdate(downl);
				 System.out.println(downl);
			    isvalidconttype= true;
			    }
			    else if("2".equals(conttypeinput))
			    {
			    	downl.getAddresslist();
			    	AddressInfoUpdate.addressdetails(downl);
			    	System.out.println(downl);
			    	isvalidconttype= true;
			    }
			    else if("3".equals(conttypeinput))
			    {
			    	downl.getAddresslist();
			    	contactUpdatepage.contactdetails(downl);
			    	System.out.println(downl);
			    	isvalidconttype= true;
			    }
			    else if("4".equals(conttypeinput))
			    {
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
			    	isvalidconttype= true;
				
			    }
			    else
			    {
			    	System.out.println("Enter valid partyTypeCd from option");
			    }
			    if(isvalidconttype == true)break;
			}
			
			update =true;
			
		}	
		else{
			System.out.println("Sequence Number not found please enter valid sequence number");
			continue;
		}	
		if (update ==true) break; 

	}
		
	}



}
