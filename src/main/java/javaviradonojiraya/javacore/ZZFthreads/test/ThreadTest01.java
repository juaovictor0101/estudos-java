package javaviradonojiraya.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            /*botando a thread para dormir, isso significa que ela terá nesse caso um tempo proprio para a execução
             que independe do tempo de processamento nesse caso, independente do tempo que uma volta no loop demora
             para ser feita, ele será executado a cada 2s nesse exemplo com 2000 ms
            ao setar um sleep, ele necessariamente precisa estar dentro de um try-catch porque caso não ocorra esse 'delaey' esperado, caso a thread não durma, será lançado uma exceção
            */

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Tipos de Threads: Daemon x User
public class ThreadTest01 {
    public static void main(String[] args) {
/*
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');
        ThreadExample t4 = new ThreadExample('D');
usando um único thread via extends
        t1.run();
        t2.run();
        t3.run();
        t4.run();
*/


        System.out.println("--------");
        //usando multiplos threads via extends
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


        //usando threads via implements
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "T4D");

        //setando prioriadades das threads, a pioridade vai de 1 a 10, normalmente indo de 1(baixa prioridade) a 10 (máxima prioridade)
        t4.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        /*
        estados de threads:

                                 walking/blocked
                                 ^
                                 |
        new -> runnable <--> running -> dead

        ao criar um thread el

         */
    }
}
