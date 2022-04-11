package TSI.HyunJoon.Ex3queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread{
    BlockingQueue blockingQueue;
    Queue<Integer> queue = new LinkedList<Integer>();
@Override
     public void run(){

         for (int i = 1;i<4;i++){
             System.out.println(queue.add(i));
             System.out.println(queue);
         }
     }

}
