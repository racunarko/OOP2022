package hr.fer.oop.mtexam.task2;

class MultiAgentSystem {
    private static int generatedId = 0;
    private int numberOfAgents;
    private Agent[] agents;

    public MultiAgentSystem(int numberOfAgents) {
        if (numberOfAgents < 0) {
            numberOfAgents = 1;
        }
        this.numberOfAgents = numberOfAgents;
        agents = new Agent[numberOfAgents];
    }

    public int getNumberOfAgents() {
        return numberOfAgents;
    }

    public void addAgent(Agent agent) {
        int id = generateId();
        generatedId++;
        agents[id] = agent;
    }

    public Agent[] getAgents() {
        return agents;
    }

    public static int generateId() {
        return generatedId;
    }

    public void printSystemInfo() {
        for (int i = 0; i < agents.length; i++) {
            if (agents[i] == null) continue;
            System.out.println(agents[i].getAgentType() + " " + agents[i].toString());
        }
    }
}
