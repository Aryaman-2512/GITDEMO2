import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class deleteuserresidential {

	public static void deleteresi(LinkedHashMap<String, PartyDo> hashmap) {
		
		for(Map.Entry<String, PartyDo> eachuser :hashmap.entrySet()){
			
			  PartyDo user = eachuser.getValue();
	          ArrayList<PartyAddressDo> listaddress = user.getAddresslist();
//			for(PartyAddressDo userlist : user.getAddresslist())
//			{
//				if(userlist.getAddressType().equals("Residential"))
//				{
////					hashmap.remove(eachuser);
//					 removable = userlist;
//					
//				}
//				
//			}
	          Iterator<PartyAddressDo> iterator = listaddress.iterator();
	            while (iterator.hasNext()) {
	                PartyAddressDo eachaddressdo = iterator.next();
	                if (eachaddressdo.getAddressType().equals("Residential")) {
	                    iterator.remove();  
	                }
	            }
	            
	            System.out.println(listaddress);
		}
		
	}

}
