import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;



import com.c2lbiz.symbiosys.systemcommon.util.DateUtil;


public class Registration {
	
	
	
	void register(PartyDo obj, LinkedHashMap<String, PartyDo> hashmap) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details :");
		
		while(true){
			
		boolean istypecd = false;  
		System.out.println("Enter partyTypeCd: ");
		System.out.println("1. Individual");
		System.out.println("2. ORGANIZATION");
	    String par = sc.nextLine();
	    if("1".equals(par))
	    {
	    	obj.setPartyTypeCd("Individual");
	    	istypecd= true;
	    }
	    else if("2".equals(par))
	    {
	    	obj.setPartyTypeCd("Organization");
	    	istypecd= true;
	    }
	    else
	    {
	    	System.out.println("Enter valid partyTypeCd from option");
	    }
	    
		 if(istypecd == true)break;
		
		 
		}
		while(true){
			
		System.out.println("Your partySeq");
		obj.setPartySeq(Integer.toString(SequenceGenerator.getInstance().currentPartySequence++));
		System.out.println(obj.getPartySeq());
		break;
		}
		
		while(true){
		boolean istypetit = false; 
		System.out.println("Enter title : \n1.Mr \n2.Ms \n3.Mrs");
		String titleinput = sc.nextLine();
		if("1".equals(titleinput))
	    {
	    	obj.setTitle("Mr");
	    	istypetit= true;
	    }
	    else if("2".equals(titleinput))
	    {
	    	obj.setTitle("Ms");
	    	istypetit= true;
	    }
	    else if("3".equals(titleinput))
	    {
	    	obj.setTitle("Mrs");
	    	istypetit= true;
	    }
	    else 
	    {
	    	System.out.println("Enter valid title from option");
	    }
	    
		 if(istypetit == true)break;
		}
//		System.out.println(obj.getTitle());
//		obj.setTitle(titleinput);
		boolean fname= false;
		while(true){
			
		System.out.println("Enter firstName");
		String firstname = sc.nextLine();
		if (!firstname.isEmpty() && firstname.matches("[a-zA-Z]+")){
		obj.setFirstName(firstname);
		fname = true;
		}
		else {System.out.println("Enter valid firstname");
		continue;}
		if (fname ==true) break; 
		}
		
		boolean lname= false;
		while(true){
//		System.out.println("Enter lastName");
//		obj.setLastName(sc.nextLine());
			System.out.println("Enter lastname");
			String lastname = sc.nextLine();
			if (!lastname.isEmpty() && lastname.matches("[a-zA-Z]+")){
			obj.setLastName(lastname);
			lname = true;
			}
			else {System.out.println("Enter valid lastname");
			continue;}
			if (lname ==true) break; 
		}
		boolean datevalid =false;
		while(true){
			
		System.out.println("Enter a date (yyyy-MM-dd):");
		String datestr = sc.nextLine();
		

		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		dateformat.setLenient(false);
		
		
		try{
			String[] parts = datestr.split("-");
			if(parts.length!=3)
			{throw new ParseException("Invalid Date Format",0);
			}
			
			int year =Integer.parseInt(parts[0]);
			int month =Integer.parseInt(parts[1]);
			int day =Integer.parseInt(parts[2]);
			
		     if (month < 1 || month > 12) {
	                System.out.println("Invalid month. Please enter a month between 01 and 12.");
	                datevalid =false;
	                return;
	            }

	            if (day < 1 || day > 31) {
	                System.out.println("Invalid day. Please enter a day between 01 and 31.");
	                datevalid =false;
	                return;
	            }
	        	Date date = dateformat.parse(datestr);
	    		Date today = new Date();
	    		
	            if(date.after(today)){
	            	System.out.println("Date cannot be in future");
	            	datevalid =false;
	            }
	           
	            else{ obj.setDate1(date);
	            obj.setAge(UtilDate.getAge(date, today));
	            datevalid =true;}
		} catch (ParseException e) {
            
            System.out.println("Invalid date format or value. Please enter a valid date in yyyy-MM-dd format.");
        } catch (NumberFormatException e) {
           
            System.out.println("Invalid date format. Please ensure the date is in yyyy-MM-dd format.");
        }
		if(datevalid == true)break;
		
		}
		
		
//		getAge(date, today)
		
		while(true){
		boolean istypegen = false; 
		System.out.println("Enter title : \n1.Male \n2.Female \n3.Transgender");
	     System.out.println("Enter genderCd");
	     String geninput = sc.nextLine();
	     if("1".equals(geninput))
		    {
		    	obj.setGenderCd("Male");
		    	istypegen= true;
		    }
		    else if("2".equals(geninput))
		    {
		    	obj.setGenderCd("Female");
		    	istypegen= true;
		    }
		    else if("3".equals(geninput))
		    {
		    	obj.setGenderCd("Transgender");
		    	istypegen= true;
		    }
		    else 
		    {
		    	System.out.println("Enter valid Gender from option");
		    }
		    
			 if(istypegen == true)break;
			}
//	     System.out.println(obj.getGenderCd());
	     
		while(true){
			PartyAddressDo addr = new PartyAddressDo();
			System.out.println("Enter address Details");
			System.out.print("Your address sequence :");
			addr.setPartyAddressSeq(Integer.toString(SequenceGenerator.getInstance().currentAddressSequence++));
			System.out.println(addr.getPartyAddressSeq());
			
			System.out.println("party sequence :"+obj.getPartySeq());
			addr.setPartySeq(obj.getPartySeq());
			while(true){
			boolean isvalidaddtype = false;  
			System.out.println("Enter address type\n1.Residential \n2.Office");
			String aadtypinput = sc.nextLine();
		    if("1".equals(aadtypinput))
		    {
		    	addr.setAddressType("Residential");
		    	isvalidaddtype= true;
		    }
		    else if("2".equals(aadtypinput))
		    {
		    	addr.setAddressType("Office");
		    	isvalidaddtype= true;
		    }
		    else
		    {
		    	System.out.println("Enter valid partyTypeCd from option");
		    }
		    if(isvalidaddtype == true)break;
			
			 
		}
			
			System.out.println("Enter coutryCd");
			
			String s = CountryStates.countrystates(addr);
//			
//			System.out.println("Enter stateCd");
//			addr.setStateCd(sc.nextLine());
			System.out.println("Enter addressDetails");
			addr.setAddressDetails(sc.nextLine());
			System.out.println("Enter pinCode");
			addr.setPinCode(sc.nextLine());
			
			
			System.out.println("Enter primaryAddress");
			System.out.println("1.Yes 2.No ");
			String ansprimary = sc.nextLine();
			if(ansprimary.equalsIgnoreCase("1")){
				addr.setPrimaryAddress("yes");}
			else if
				(ansprimary.equalsIgnoreCase("2")){
				addr.setPrimaryAddress("no");}
			
			
			
			obj.getAddresslist().add(addr);
			
			System.out.println("Do you want to add another address");
			System.out.println("1.Yes 2.No ");
			String ans = sc.nextLine();
			if(ans.equals("2")){
				
				boolean checkp = checkPrimary(obj);
				
				if(checkp == false)
				{
					setPrimary(obj);
					break;
				}
				else{
					
					break;
					
				}
				
			}
		}
		
		boolean contmore= false;
		while(true){
			PartyContactDo cont = new PartyContactDo();
			System.out.println("Enter contact Details");
			System.out.println("Your ContactSeq");
			cont.setPartyContactSeq((Integer.toString(SequenceGenerator.getInstance().currentContactSequence)));
			System.out.println(cont.getPartyContactSeq());
			while(true){
			boolean isvalidconttype = false;  
			System.out.println("Enter contact type\n1.Mobile \n2.Office \n3.Residential");
			String conttypeinput = sc.nextLine();
		    if("1".equals(conttypeinput))
		    {
		    	cont.setContactType("Mobile");
		    	isvalidconttype= true;
		    }
		    else if("2".equals(conttypeinput))
		    {
		    	cont.setContactType("Office");
		    	isvalidconttype= true;
		    }
		    else if("3".equals(conttypeinput))
		    {
		    	cont.setContactType("Residential");
		    	isvalidconttype= true;
		    }
		    else
		    {
		    	System.out.println("Enter valid partyTypeCd from option");
		    }
		    if(isvalidconttype == true)break;
			
			 
		}
			boolean contnum= false;
//			System.out.println("Enter contact Number");
//			cont.setContactNum(sc.nextLine());
			while(true){
				System.out.println("Enter contact Number");
				String contactinput = sc.nextLine();
//				cont.setContactNum(sc.nextLine());
//				System.out.println("Enter firstName");
//				String firstname = sc.nextLine();
				if (!contactinput.isEmpty() && contactinput.matches("\\d{1,10}") ){
//				obj.s(contactinput);
				cont.setContactNum(contactinput);
				contnum = true;
				}
				else {System.out.println("Enter valid contact");
				continue;}
				if (contnum ==true) break; 
				}
			
			
			
			obj.getContactlist().add(cont);
			
			System.out.println("Do you want to add another contact");
			System.out.println("1.Yes 2.No ");
			String ans = sc.nextLine();
			if(ans.equals("2")){
				
				
				contmore = true;;
				
			}
			if(contmore==true)break;
		}
		
		System.out.println(obj);
				
	}

	

	public void setPrimary(PartyDo obj) {
		
		while(true){
		Scanner sca = new Scanner(System.in);
		ArrayList<PartyAddressDo> checkaddresslist = obj.getAddresslist();
		System.out.println(obj);
		System.out.println("Which address you want to make primary, Enter the sequence number");
		String seqnum = sca.nextLine();
		boolean out = false;
		for(PartyAddressDo person:checkaddresslist)
		{
			if(seqnum.equals(person.getPartyAddressSeq())){
				person.setPrimaryAddress("yes");
				out = true;
			}
			else
			{
				System.out.println("please enter a valid address seq num");
			}
		}
		if(out == true){
			break;
		}
		}
		
	}

	public boolean checkPrimary(PartyDo obj) {
		ArrayList<PartyAddressDo> checkaddresslist = obj.getAddresslist();
		
		
		boolean foundprimary = false;
		
		for(PartyAddressDo person: checkaddresslist)
		{
			if("yes".equals(person.getPrimaryAddress())){
				foundprimary=true;
			}
			
		}
		return foundprimary;
		
	}
}