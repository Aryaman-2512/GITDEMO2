
public class PartyAddressDo {
	
 
  String partyAddressSeq;
  String partySeq;
  String addressType;
  String coutryCd;
  String stateCd;
  String addressDetails;
  String pinCode;
  String primaryAddress;
  
  
public String toString(){
	return "Address details: \n"+"PartyAddresssequence :"+partyAddressSeq+"\t"+"\t"+"AddressType :"+addressType+"\t"+"Country :"+coutryCd+"\t"+"State :"+stateCd+"\t"+"Address details :"+addressDetails+"\t"+"Pincode :"+pinCode+"\t"+"PrimaryAddress :"+primaryAddress;
}
public String getPartyAddressSeq() {
	return partyAddressSeq;
}
public void setPartyAddressSeq(String partyAddressSeq) {
	this.partyAddressSeq = partyAddressSeq;
}
public String getPartySeq() {
	return partySeq;
}
public void setPartySeq(String partySeq) {
	this.partySeq = partySeq;
}
public String getAddressType() {
	return addressType;
}
public void setAddressType(String addressType) {
	this.addressType = addressType;
}
public String getCoutryCd() {
	return coutryCd;
}
public void setCoutryCd(String coutryCd) {
	this.coutryCd = coutryCd;
}
public String getStateCd() {
	return stateCd;
}
public void setStateCd(String stateCd) {
	this.stateCd = stateCd;
}
public String getAddressDetails() {
	return addressDetails;
}
public void setAddressDetails(String addressDetails) {
	this.addressDetails = addressDetails;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public String getPrimaryAddress() {
	return primaryAddress;
}
public void setPrimaryAddress(String primaryAddress) {
	this.primaryAddress = primaryAddress;
}
  
}
