import java.util.Scanner;


public class AddressInfoUpdate {

	public static void addressdetails(PartyDo downl) {
		
		 System.out.println(downl.getAddresslist());
		 
		 
	        System.out.println("Enter the address sequence number which u wnat to edit");
	        System.out.println(downl.getAddresslist());
			Scanner sc = new Scanner(System.in);
			String inputaddressseq = sc.nextLine();
			
			for(PartyAddressDo obj:downl.getAddresslist())
			{    
				
				if(obj.getPartyAddressSeq().equals(inputaddressseq))
				{
					
					System.out.println("what you want to update here");
					System.out.println("1. AddressType\t 2.Country & State\t 3.Address details\t 4.Pincode\t 5.PrimaryAddress");
					String input = sc.nextLine();
					if("1".equals(input))
				    {
						while(true){
							boolean isvalidaddtype = false;  
							System.out.println("Enter address type\n 1.Residential \n2.Office");
							String aadtypinput = sc.nextLine();
						    if("1".equals(aadtypinput))
						    {
						    	obj.setAddressType("Residential");
						    	isvalidaddtype= true;
						    }
						    else if("2".equals(aadtypinput))
						    {
						    	obj.setAddressType("Office");
						    	isvalidaddtype= true;
						    }
						    else
						    {
						    	System.out.println("Enter valid partyTypeCd from option");
						    }
						    if(isvalidaddtype == true)break;
							
							 
						}
					
					}
				    else if("2".equals(input))
				    {
				    	System.out.println("Enter coutryCd");
						
						String s = CountryStates.countrystates(obj);
				    		
				    }
				    else if("3".equals(input))
				    {
				    	System.out.println("Enter addressDetails");
				    	obj.setAddressDetails(sc.nextLine());
				    		
				    }
				    else if("4".equals(input))
				    {
				    	System.out.println("Enter pinCode");
						obj.setPinCode(sc.nextLine());
				    		
				    }
				    else if("5".equals(input))
				    {
				    	System.out.println("Enter primaryAddress");
				    	obj.setPrimaryAddress(sc.nextLine());
				    		
				    }
				    else
				    {
				    	System.out.println("Enter valid  from option");
				    }
				 
				}
				    
				    
			}
				
	}

}
