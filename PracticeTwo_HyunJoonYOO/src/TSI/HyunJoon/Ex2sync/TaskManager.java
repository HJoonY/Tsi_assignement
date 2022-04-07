package TSI.HyunJoon.Ex2sync;

public class TaskManager{
    static void performTask(int taskId) throws InterruptedException {
        System.out.println(Thread.currentThread() +":"+ taskId);
        Thread.sleep(4);
        System.out.println(Thread.currentThread() +":"+ taskId);
    }
}

