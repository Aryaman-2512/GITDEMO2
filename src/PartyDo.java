import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

public class PartyDo {
	 String partyTypeCd;
	 String partySeq;
	 String title;
	 DateTime date;
	 Date date1;
	 
	 
	

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime dateTime) {
		this.date = dateTime;
	}

	public String getPartyTypeCd() {
		return partyTypeCd;
	}
	 
	 public String toString(){
			return "Basic Details : \n" +"partyseq :"+partySeq+"\n"+"partytype :"+partyTypeCd+  "\n" +"title :" + title+ "\n" +"Age :"+ age +"\n" +"Firstname :"+ firstName +"\n" +"Lastname :"+ lastName +"\n" +"Gender :"+ genderCd +"\n" + "Address detail: \n"+addresslist+"\n" +"Contact details: \n"+ contactlist+"\n" ;
		}
	public void setPartyTypeCd(String partyTypeCd) {
		this.partyTypeCd = partyTypeCd;
	}
	public String getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(String partySeq) {
		this.partySeq = partySeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<PartyContactDo> getContactlist() {
		return contactlist;
	}
	public void setContactlist(ArrayList<PartyContactDo> contactlist) {
		this.contactlist = contactlist;
	}
	String firstName;
	 String lastName;
	 String genderCd;
	 int age;
	ArrayList<PartyAddressDo> addresslist = new ArrayList<PartyAddressDo>();
	ArrayList<PartyContactDo> contactlist = new ArrayList<PartyContactDo>();
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<PartyAddressDo> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(ArrayList<PartyAddressDo> addresslist) {
		this.addresslist = addresslist;
	}
	public ArrayList<PartyContactDo> getContatctlist() {
		return contatctlist;
	}
	public void setContatctlist(ArrayList<PartyContactDo> contatctlist) {
		this.contatctlist = contatctlist;
	}
	ArrayList<PartyContactDo> contatctlist = new ArrayList<PartyContactDo>();




	
	
}
