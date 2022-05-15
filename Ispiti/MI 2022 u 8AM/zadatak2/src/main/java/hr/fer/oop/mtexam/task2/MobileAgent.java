package hr.fer.oop.mtexam.task2;

class MobileAgent extends Agent implements Movable{
    private int taskId;

    public MobileAgent(String name, int ID) {
        super(name, ID);
        doRemoteTask();
    }

    @Override
    public String getAgentType() {
        return "mobile agent";
    }

    @Override
    public String toString() {
        return String.format("(name: %s, id: %d)", getName(), getID());
    }

    public int getTaskId() {
        return taskId;
    }

    public void doRemoteTask() {
        taskId = (int)(Math.random() * (10 - 1 + 1) + 1);
    }
}
