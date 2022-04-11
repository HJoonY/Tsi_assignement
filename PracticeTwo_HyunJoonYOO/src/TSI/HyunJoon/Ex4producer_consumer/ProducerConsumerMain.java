package TSI.HyunJoon.Ex4producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Consumer consumer= new Consumer();
        Producer producer = new Producer();
       producer.start();
//       consumer.start();
    }
}
