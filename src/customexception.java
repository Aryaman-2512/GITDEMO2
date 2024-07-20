import java.util.LinkedHashMap;


public class customexception {
	public static void validate(String s,LinkedHashMap<String, PartyDo>lhm) throws InvalidUserException.PartySequenceNotFoundException{
		if(!(lhm.containsKey(s)))throw new InvalidUserException.PartySequenceNotFoundException("not Found");
		else System.out.println("works");
	}
}
