package TSI.HyunJoon.Ex1.priority;

import prof.Worker;

public class PriorityMain {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("Minimum priority");
        PriorityThread thread2 = new PriorityThread("Normal priority");
        PriorityThread thread3 = new PriorityThread("Maximum priority");
       /*
        // Thread 1
        // Display the priority of above thread
        System.out.println(thread1.getName()+ "thread priority : "
                + thread1.getPriority());
        // Thread 2
        System.out.println(thread2.getName()+"thread priority : "
                + thread2.getPriority());
        // Thread 3
        System.out.println(thread2.getName()+" thread priority : "
                + thread3.getPriority());

         => all of those thread priority are same right now
        */
        // Setting priorities of above threads
        thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(10);

        // Display the priority of above thread
        System.out.println(thread1.getName()+ "thread priority : "
                + thread1.getPriority());
        // Thread 2
        System.out.println(thread2.getName()+"thread priority : "
                + thread2.getPriority());
        // Thread 3
        System.out.println(thread2.getName()+" thread priority : "
                + thread3.getPriority());
    }

}


