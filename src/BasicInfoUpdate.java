import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class BasicInfoUpdate {

	public static void basicupdate(PartyDo downl) {
		Scanner sc = new Scanner(System.in);
		boolean isoption = false;
		while(true){
		System.out.println("what you want to update here");
		System.out.println("1.partyType\t 2.Title\t 3.firstname\t 4.lastname\t 5.Dob\t 6.Gender");
		
		String input  = sc.nextLine();
		
		if("1".equals(input)){
		 while(true){
			
			boolean istypecd = false;  
			System.out.println("Enter partyTypeCd: ");
			System.out.println("1. Individual");
			System.out.println("2. ORGANIZATION");
		    String par = sc.nextLine();
		    if("1".equals(par))
		    {
		    	downl.setPartyTypeCd("Individual");
		    	istypecd= true;
		    }
		    else if("2".equals(par))
		    {
		    	downl.setPartyTypeCd("Organization");
		    	istypecd= true;
		    }
		    else
		    {
		    	System.out.println("Enter valid partyTypeCd from option");
		    }
		    
			 if(istypecd == true)break;
			
			 
			}
		 isoption=true;
	}
		if("2".equals(input)){
			while(true){
				boolean istypetit = false; 
				System.out.println("Enter title : \n1.Mr \n2.Ms \n3.Mrs");
				String titleinput = sc.nextLine();
				if("1".equals(titleinput))
			    {
			    	downl.setTitle("Mr");
			    	istypetit= true;
			    }
			    else if("2".equals(titleinput))
			    {
			    	downl.setTitle("Ms");
			    	istypetit= true;
			    }
			    else if("3".equals(titleinput))
			    {
			    	downl.setTitle("Mrs");
			    	istypetit= true;
			    }
			    else 
			    {
			    	System.out.println("Enter valid title from option");
			    }
			    
				 if(istypetit == true)break;
				}
			
			isoption=true;
		}
	 
        if("3".equals(input)){
        	boolean fname= false;
    		while(true){
    			
    		System.out.println("Enter firstName");
    		String firstname = sc.nextLine();
    		if (!firstname.isEmpty() && firstname.matches("[a-zA-Z]+")){
    		downl.setFirstName(firstname);
    		fname = true;
    		}
    		else {System.out.println("Enter valid firstname");
    		continue;}
    		if (fname ==true) break; 
    		}
        	isoption=true;
		}
        
        if("4".equals(input)){
        	boolean lname= false;
    		while(true){
//    		System.out.println("Enter lastName");
//    		obj.setLastName(sc.nextLine());
    			System.out.println("Enter lastname");
    			String lastname = sc.nextLine();
    			if (!lastname.isEmpty() && lastname.matches("[a-zA-Z]+")){
    			downl.setFirstName(lastname);
    			lname = true;
    			}
    			else {System.out.println("Enter valid lastname");
    			continue;}
    			if (lname ==true) break; 
    		}
        	isoption=true;
		}
        
        if("5".equals(input)){
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
    	           
    	            else{ downl.setDate1(date);
    	            downl.setAge(UtilDate.getAge(date, today));
    	            datevalid =true;}
    		} catch (ParseException e) {
                
                System.out.println("Invalid date format or value. Please enter a valid date in yyyy-MM-dd format.");
            } catch (NumberFormatException e) {
               
                System.out.println("Invalid date format. Please ensure the date is in yyyy-MM-dd format.");
            }
    		if(datevalid == true)break;
    		
    		}
    		
        	isoption=true;
		}
        
        
        
        if("6".equals(input)){
        	while(true){
        		boolean istypegen = false; 
        		System.out.println("Enter title : \n1.Male \n2.Female \n3.Transgender");
        	     System.out.println("Enter genderCd");
        	     String geninput = sc.nextLine();
        	     if("1".equals(geninput))
        		    {
        	    	 downl.setGenderCd("Male");
        		    	istypegen= true;
        		    }
        		    else if("2".equals(geninput))
        		    {
        		    	downl.setGenderCd("Female");
        		    	istypegen= true;
        		    }
        		    else if("3".equals(geninput))
        		    {
        		    	downl.setGenderCd("Transgender");
        		    	istypegen= true;
        		    }
        		    else 
        		    {
        		    	System.out.println("Enter valid Gender from option");
        		    }
        		    
        			 if(istypegen == true)break;
        			}
        	isoption=true;
		}
        
        if(isoption == true)break;
	}
	}
}
