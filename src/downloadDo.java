import java.util.LinkedHashMap;
import java.util.Scanner;

import com.c2lbiz.symbiosys.systemcommon.util.FileUtil;


public class downloadDo {

	public void downloadparty(LinkedHashMap<String, PartyDo > hashmap) throws Exception {
	
	    boolean downloa= false;
		while(true){
			System.out.println("Please enter the party sequence Number to download");
			Scanner sc =  new Scanner(System.in);
			String download= sc.nextLine();
			
			if(hashmap.containsKey(download))
			{  
				
				
				PartyDo downl = hashmap.get(download);
				String s =downl.toString();
				
				UtilDownload.createFile("C:\\Users\\aryaman.more\\Downloads", "downloadDo1.txt", s);
				downloa =true;
			}	
			else{
				System.out.println("please enter valid party sequence number");
				continue;
			}	
			if (downloa ==true) break; 
	
		}
	}
}
