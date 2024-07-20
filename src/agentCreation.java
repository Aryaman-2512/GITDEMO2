import java.util.LinkedHashMap;


public class agentCreation {
	

	

	public static void createagents(LinkedHashMap<String, AgentDo> agents) {
		AgentDo agent1 = new AgentDo("1","Sunil","Mumbai");
		AgentDo agent2 = new AgentDo("2","Anil","Pune");
		AgentDo agent3 = new AgentDo("3","Vikas","Raigad");
		AgentDo agent4 = new AgentDo("4","Raju","Ratnagiri");
		
		agents.put(agent1.getAgentid(), agent1);
		agents.put(agent2.getAgentid(), agent2);
		agents.put(agent3.getAgentid(), agent3);
		agents.put(agent4.getAgentid(), agent4);
		
	
		
		
		
		
	}
	
}
