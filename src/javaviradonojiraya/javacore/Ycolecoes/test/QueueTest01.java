package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        //caracteristica FIFO (first in = first out)
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
//        fila.peek(); //só retorna o primeiro da fila
//        fila.element();//retorna o primeiro da fila, e lança uma execeção caso a fila esteja vazia
//        fila.poll(); //retorna e remove o primeiro da fila e retorna NULL se a fila estiver vazia
//        for (String s : fila) {
//            System.out.println(s);
//        }

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
