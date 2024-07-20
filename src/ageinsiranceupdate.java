import java.util.LinkedHashMap;
import java.util.Map;


public class ageinsiranceupdate {

	public static void conditionage(LinkedHashMap<String, PartyDo> hashmap,
			LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies) {
		//if age greater than 40 increase sumassured by 10%
		
		for(Map.Entry<String,PartyDo> eachuser:hashmap.entrySet())
		{
			String s = eachuser.getKey();
			PartyDo user = eachuser.getValue();
			 int userage = user.getAge();
		     
			 if(userage>30)
			 {
				 
					 LinkedHashMap<String, basePolicyDo> policiesuser = policies.get(s);
					 if(policiesuser==null || policiesuser.isEmpty());
				       {
				    	   System.out.println("No policy");
				       }
				       
				       for(Map.Entry<String,basePolicyDo> entry : policiesuser.entrySet())
				       {
				    	basePolicyDo policy = entry.getValue();
				       if(policy instanceof terminsuranceDo)
				       {
				    	   ((terminsuranceDo) policy).setSumAssured(((terminsuranceDo) policy).getSumAssured()+ 0.1*((terminsuranceDo) policy).sumAssured);
				       }
				       else if(policy instanceof termhealthInsurance)
				       {
				    	   ((termhealthInsurance) policy).setSumAssured(((termhealthInsurance) policy).getSumAssured()+ 0.1*((termhealthInsurance) policy).sumAssured);
				       }
				       }
				       
				       System.out.println(s);
				       System.out.println(policiesuser);
			 }
			
		}
		
	}

}
