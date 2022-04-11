package TSI.HyunJoon.Ex3queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{
    BlockingQueue blockingQueue;
    AddingThread addingThread = new AddingThread();
    @Override
    public void run(){
        try {
            addingThread.run();
            Queue queue = addingThread.queue;

            Thread.sleep(1000); // 1 second
            for (Object element: queue) {
                System.out.println(element);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
