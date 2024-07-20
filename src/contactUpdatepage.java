import java.util.ArrayList;
import java.util.Scanner;


public class contactUpdatepage {

	public static void contactdetails(PartyDo downl) {
		
        System.out.println(downl.getContactlist());
	

       
        System.out.println("Enter the contact sequence number which u wnat to edit");
        System.out.println(downl.getContactlist());
		Scanner sc = new Scanner(System.in);
		String inputcontactseq = sc.nextLine();
		
		for(PartyContactDo obj:downl.getContactlist())
		{    
			
			if(obj.getPartyContactSeq().equals(inputcontactseq))
			{
				
				System.out.println("what you want to update here");
				System.out.println("1. ContactType\t 2.Contact Number\t ");
				String input = sc.nextLine();
				if("1".equals(input))
			    {
					while(true){
						boolean isvalidconttype = false;  
						System.out.println("Enter contact type\n 1.Mobile \n2.Office \n3.Residential");
						String conttypeinput = sc.nextLine();
					    if("1".equals(conttypeinput))
					    {
					    	obj.setContactType("Mobile");
//					    	downl.setAddresslist(obj);
					    	isvalidconttype= true;
					    }
					    else if("2".equals(conttypeinput))
					    {
					    	obj.setContactType("Office");
					    	isvalidconttype= true;
					    }
					    else if("3".equals(conttypeinput))
					    {
					    	obj.setContactType("Residential");
					    	isvalidconttype= true;
					    }
					    else
					    {
					    	System.out.println("Enter valid partyTypeCd from option");
					    }
					    if(isvalidconttype == true)break;
						
						 
				
			         }
				
				}
			    else if("2".equals(input))
			    {
			    	System.out.println("Enter contact Number");
					obj.setContactNum(sc.nextLine());
			    		
			    }
		
			    else
			    {
			    	System.out.println("Enter valid  from option");
			    }
			 
			}
			    
			    
		}
			
		}
	}
		
		
	

