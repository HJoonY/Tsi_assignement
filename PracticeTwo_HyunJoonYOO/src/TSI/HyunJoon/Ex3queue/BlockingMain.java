package TSI.HyunJoon.Ex3queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);

        AddingThread addingThread = new AddingThread();
        TakingThread takingThread = new TakingThread();

        addingThread.run();
        takingThread.run();
    }
}