package TSI.HyunJoon.Ex2sync;

public class TaskThread extends Thread{
    int taskId;
    TaskManager manager;

    public TaskThread(String Name, int taskId, TaskManager manager) {
        super(Name);
        this.taskId = taskId;
        this.manager = manager;
    }

    @Override
    public void run(){
        try {
            TaskManager.performTask(taskId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }



