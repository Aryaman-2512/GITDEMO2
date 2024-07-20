import java.security.Policy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class SearchDo {
	
	public void searchpartDo(LinkedHashMap<String, PartyDo> hashmap) {
		
		while(true){

					try{
						
						System.out.println("Please enter the party sequence Number to be searched");
						Scanner sc =  new Scanner(System.in);
						String sear= sc.nextLine();
						
							customexception.validate(sear, hashmap);
							PartyDo downl = hashmap.get(sear);
						
							System.out.println("The searched object is");
							System.out.println(downl);
								break;
					}
			
				        catch(Exception e){
						System.out.println("exception occured " + e);
					}
			
		}
	}

}
