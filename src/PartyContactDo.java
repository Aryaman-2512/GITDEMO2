
public class PartyContactDo {
 String partyContactSeq;
 String contactType;
 String contactNum;
 
 
 public String toString(){
		return "Contact details: \n"+"partyContactSeq :"+partyContactSeq+"\t"+"ContactType :"+contactType+"\t"+"Contact Number :"+contactNum+"";
	}
public String getPartyContactSeq() {
	return partyContactSeq;
}
public void setPartyContactSeq(String partyContactSeq) {
	this.partyContactSeq = partyContactSeq;
}
public String getContactType() {
	return contactType;
}
public void setContactType(String contactType) {
	this.contactType = contactType;
}
public String getContactNum() {
	return contactNum;
}
public void setContactNum(String contactNum) {
	this.contactNum = contactNum;
}
}
