
public class terminsuranceDo extends basePolicyDo {
	String policyseq;
	double premiumAmt;
	double sumAssured;
	String agentid;
	String partyseq;
	terminsuranceDo(String partyseq, String policyseq, double sumAssured, double premium, String agentopt){
		super(partyseq);
		this.partSeq = partyseq;
		this.premiumAmt= premium;
		this.sumAssured= sumAssured;
		this.policyseq = policyseq;
		this.agentid = agentopt;
	}
	public String toString(){
		return "Policy details: \n"+"PolicySequence:"+policyseq+"\t"+"PartySequence:"+super.partSeq+"\t"+"Premium amount :"+premiumAmt+"\t"+"Sumassured :"+sumAssured+" Agentid :"+agentid+"\n";
	}
	
	public String getPolicyseq() {
		return policyseq;
	}
	public void setPolicyseq(String policyseq) {
		this.policyseq = policyseq;
	}
	public double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	
}
