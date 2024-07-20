
public class termhealthInsurance extends basePolicyDo {
	
	
	public termhealthInsurance(String partyseq, String policyseq,  double premium, double sumAssured,double healthCover, String agentopt) {
		super(partyseq);
		this.premiumAmt= premium;
		this.sumAssured= sumAssured;
		this.policyseq = policyseq;
		this.healthcover = healthCover; 
		this.agentid =agentopt;
	}
	public String toString(){
		return "Policy details: \n"+"PolicySequence:"+policyseq+"\t"+"PartySequence:"+super.partSeq+"\t"+"Premium amount :"+premiumAmt+"\t"+"Sumassured :"+sumAssured+"\t"+"healthcover :"+healthcover+"Agentid :"+agentid;
	}
	String policyseq;
	double premiumAmt;
	double sumAssured;
	double healthcover;
	String agentid;
	String partyseq;
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
