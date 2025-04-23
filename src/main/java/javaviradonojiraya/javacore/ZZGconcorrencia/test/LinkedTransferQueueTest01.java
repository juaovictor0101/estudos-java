package javaviradonojiraya.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue +  SynchronousQueue + LinkedBlockingQueue = LinkedTransferQueue


        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("João"));
        System.out.println(tq.offer("João"));
        System.out.println(tq.offer("João", 10, TimeUnit.SECONDS));
        tq.put("joão");

        if (tq.hasWaitingConsumer()) {
            tq.transfer("João Victor");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());


    }

}
