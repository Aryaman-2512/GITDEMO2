import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class Statescheck {

	public static void findstate(LinkedHashMap<String, PartyDo> hashmap,
			ArrayList<String> states) {
		
		for(Map.Entry<String, PartyDo> entrystate: hashmap.entrySet())
		{
			PartyDo indi = entrystate.getValue();
			ArrayList<PartyAddressDo> state = indi.addresslist;
			for(PartyAddressDo statein: state)
			{
				if(statein.getStateCd().equals("Maharashtra"))
				{	
					
					states.add(indi.getPartySeq());
				}
			}
		}
		
	}

}
