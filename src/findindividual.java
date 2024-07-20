import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class findindividual {

	public static void findpartype(LinkedHashMap<String, PartyDo> hashmap,
			ArrayList<String> partyseqindividual) {
		
		for(Map.Entry<String,PartyDo> entry : hashmap.entrySet())
	       {
			PartyDo user = entry.getValue();
			System.out.println(user.getPartyTypeCd());
			if(("Individual").equals(user.getPartyTypeCd()))
			{
				partyseqindividual.add(user.getPartySeq());
			}
			
	       }
		
	}

}
