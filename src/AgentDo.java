import java.util.ArrayList;


public class AgentDo {
	String Agentid;
	String AgentName;
	String Location;
	int countPArties;
	double totalSales;
	ArrayList<Double> agentsum = new ArrayList<Double>();
	ArrayList<Integer> contactlist = new ArrayList<Integer>();
	
	public AgentDo(String agentid, String agentName, String location) {
		Agentid = agentid;
		AgentName = agentName;
		Location = location;
	}
	
	public String toString(){
		return "Agent details: \n"+"Agentid :"+Agentid+"\t"+"\t"+"AgentName :"+AgentName+"\t"+"Location :"+Location+"\t";
	}
	
	public ArrayList<Double> getAgentsum() {
		return agentsum;
	}
	public void setAgentsum(ArrayList<Double> agentsum) {
		this.agentsum = agentsum;
	}
	public ArrayList<Integer> getContactlist() {
		return contactlist;
	}
	public void setContactlist(ArrayList<Integer> contactlist) {
		this.contactlist = contactlist;
	}
	public String getAgentid() {
		return Agentid;
	}
	public void setAgentid(String agentid) {
		Agentid = agentid;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getCountPArties() {
		return countPArties;
	}
	public void setCountPArties(int countPArties) {
		this.countPArties = countPArties;
	}
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
}



