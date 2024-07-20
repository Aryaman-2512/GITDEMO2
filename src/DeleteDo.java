import java.util.LinkedHashMap;
import java.util.Scanner;


public class DeleteDo {
	  boolean dele= false;
	public void deletepartyDo(LinkedHashMap<String, PartyDo> hashmap) {
		
		while(true){
		display(hashmap);
		System.out.println("Please enter the party sequence Number to be deleted");
		Scanner sc =  new Scanner(System.in);
		String delete= sc.nextLine();
		
		if(hashmap.containsKey(delete))
		{  
			
			
			PartyDo downl = hashmap.get(delete);
//			System.out.println(downl);
			
			hashmap.remove(delete);
			System.out.println("The item has been deleted");
			display(hashmap);
			
			dele =true;
			
		}	
		else{
			System.out.println("Sequence Number not found please enter valid sequence number");
			continue;
		}	
		if (dele ==true) break; 

	}
	}
	private void display(LinkedHashMap<String, PartyDo> hashmap) {
		
		for (String key : hashmap.keySet()) {
		    PartyDo val = hashmap.get(key);
		    System.out.println(val);
		}
	}
}
