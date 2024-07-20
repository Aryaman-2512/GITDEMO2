import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class CountryStates {
	public static String countrystates(PartyAddressDo addr) {
		LinkedHashMap<String, ArrayList<String>> countrystatemap = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String> indiastates = new ArrayList<String>();
		indiastates.add("Maharashtra");
		indiastates.add("Gujarat");
		indiastates.add("Rajasthan");
		indiastates.add("Uttar Pradesh");
		indiastates.add("karnataka");
		indiastates.add("Tamilnadu");
		indiastates.add("kerala");
		indiastates.add("Chattisgarh");
		
		ArrayList<String> Usstates = new ArrayList<String>();
		Usstates.add("California");
		Usstates.add("Florida");
		Usstates.add("Arizona");
		Usstates.add("Texas");
		Usstates.add("Ohio");
		Usstates.add("Vermont");
		Usstates.add("Michigan");
		Usstates.add("Inidiana");
		

		countrystatemap.put("1", indiastates);
		countrystatemap.put("2", Usstates);
		
		 LinkedHashMap<String, String> countryNames = new LinkedHashMap<String, String>();
	     countryNames.put("1", "India");
	     countryNames.put("2", "USA");
	     
	     Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Select a country:");
	        for (String key : countryNames.keySet()) {
	            System.out.println(key + " : " + countryNames.get(key));
	        }
	        
	       String countryChoice = scanner.nextLine();
	       
	       if (countrystatemap.containsKey(countryChoice)) {
	            addr.setCoutryCd(countryNames.get(countryChoice));
	            ArrayList<String> states = countrystatemap.get(countryChoice);

	           
	            System.out.println("Select a state in " + countryNames.get(countryChoice) + ":");
	            for (int i = 0; i < states.size(); i++) {
	                System.out.println((i + 1) + " : " + states.get(i));
	            }

	            int stateChoice = scanner.nextInt();

	            if (stateChoice > 0 && stateChoice <= states.size()) {
	            	 addr.setStateCd(states.get(stateChoice-1));

	            } else {
	                System.out.println("Invalid state selection.");
	            }
	        } else {
	            System.out.println("Invalid country selection.");
	        }

		return null;
	}
}
