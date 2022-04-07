package TSI.HyunJoon.Ex2sync;

public class SyncMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        final TaskThread thread1 = new TaskThread("thread1",1323,taskManager);
        final TaskThread thread2 = new TaskThread("thread2",1324,taskManager);
        final TaskThread thread3 = new TaskThread("thread3",1325,taskManager);


        try {
            thread1.start();
            Thread.sleep(4);
            thread2.start();
            Thread.sleep(4);
            thread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
