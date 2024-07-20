import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class searchbycontact {

	public static boolean Contactseach(LinkedHashMap<String, PartyDo> hashmap, boolean con) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter contact to be searched");
		String number =sc.nextLine();
		for(Map.Entry<String, PartyDo> entrystate: hashmap.entrySet())
		{
			PartyDo indi = entrystate.getValue();
			ArrayList<PartyContactDo> contact = indi.getContactlist();

			for(PartyContactDo conta: contact)
			{
				if(conta.getContactNum().equals(number))
				{	
					
					System.out.println(indi);
					con =true;
					break;
				}
			}
		}
		return con;
	}

}
