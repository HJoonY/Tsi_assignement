package prof;


import java.util.List;
import java.util.Random;

public class TaskManagerprof extends Thread{

    final List<Worker> workers;

    Random random = new Random();


    public TaskManagerprof(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(random.nextInt(100));
            var worker = workers.get(random.nextInt(workers.size()));
            worker.setKillSwitch(true);
            System.out.println("Killing worker : "+ worker.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}