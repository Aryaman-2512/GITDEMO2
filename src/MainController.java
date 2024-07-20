import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class MainController {
public static void main(String[] args) throws Exception {
	
	
	
	
	LinkedHashMap<String, PartyDo> hashmap = new LinkedHashMap<String, PartyDo>();
	
	LinkedHashMap<String, AgentDo> agents = new LinkedHashMap<String, AgentDo>();
	LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>> policies =  new LinkedHashMap<String, LinkedHashMap<String, basePolicyDo>>();
	
	boolean exit = false;
	while(true){
	System.out.println("Hiicc");
	System.out.println("Welcome");
	System.out.println(" 1. Create\n 2. Update\n 3. Delete\n 4. Search\n 5. Download\n 6. Comnplete Details\n 7. Buy Policy\n 8. Search policy\n 9. Upgrade policy\n 10.Summary of Indurance type \n 11.SearchByContact  \n 12.search agentclients 13.");
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	
	agentCreation.createagents(agents);
	
	switch(n)
	{
	case 1:
		PartyDo obj1= new PartyDo();
		Registration reg = new Registration();
		reg.register(obj1,hashmap);
		hashmap.put(obj1.getPartySeq(), obj1);
	    break;
	    
	
	case 2:
		UpdateDo update = new UpdateDo();
		update.updatepartDo(hashmap,policies);
//		System.out.println(policies);
		break;
		
	case 3:
		DeleteDo del = new DeleteDo();
		del.deletepartyDo(hashmap);
		break;
		
	case 4:
		SearchDo sear = new SearchDo();
		sear.searchpartDo(hashmap);
		break;
		
	case 5:
		downloadDo down = new downloadDo();
		down.downloadparty(hashmap);
		break;
	
	case 6:
		System.out.println("The complete details of the clients are: ");
		CompleteDetails cmpdetails =  new CompleteDetails();
		cmpdetails.printCompleteDetails(hashmap);
		break;
		
	case 7:
		BuyPolicy buyp= new BuyPolicy();
		buyp.Buypolicyfunc(hashmap,policies,agents);
		break;
		
	case 8:
		searchpolicy seach = new searchpolicy();
		seach.searchPolicy(policies,hashmap);
		break;
		
	case 9:
		Updatepremium updatepremium = new Updatepremium();
		updatepremium.premium(hashmap,policies);
		System.out.println(policies);
		break;
	case 10:
		Summaryinsurancetype.insurancetype(hashmap,policies);
		break;
	case 11:
		boolean con=false;
		boolean conta = searchbycontact.Contactseach(hashmap,con);
		if(conta==false)
		{
			System.out.println("Not found");
		}
		
	    break;
	case 12:
		agentfindpoliciesold.findpoliciesnumber(policies);
		break;
	case 13:
		deleteuserresidential.deleteresi(hashmap);
		System.out.println(hashmap);
		break;
	case 14:
		ageinsiranceupdate.conditionage(hashmap,policies);
		
		break;
	case 15:
		ArrayList<String> partyseqindividual = new ArrayList<String>();
		findindividual.findpartype(hashmap,partyseqindividual);
		System.out.println(partyseqindividual);
		break;
	case 16:
		salesdata.salesdatafunc(policies);
		break;
	case 17:
		agentclientsummary.agentclientfunc(policies);
		break;
	case 18:
		policiesbyname.policiesname(hashmap,policies);
		break;
	case 19:
		searchbypoliseq.poliseq(hashmap,policies);
		break;
	case 20:
		sumassuredmore.sumass(hashmap,policies);
		break;
	case 21:
		bothpolicies.bothpolicy(hashmap,policies);
		break;
	default:
		System.out.println("Thank you");
		
	
	
	}
} 
}}
