package javaviradonojiraya.javacore.ZZGconcorrencia.test;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        // [1] o CopyOnWriteArrayList copia e cria um novo array a cada alteração;
        //[1,2] -> criou um outro com 1 e ;
        // -> criou um terceiro array com 1,2 e 3;
        //[1,2 -> criou um quarto array excluindo o 3;

        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i <500 ; i++) {
                System.out.printf("%s removed %n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
