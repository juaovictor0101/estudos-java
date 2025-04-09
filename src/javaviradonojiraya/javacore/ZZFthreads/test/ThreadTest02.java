package javaviradonojiraya.javacore.ZZFthreads.test;


class ThreadExampleRunnable02 implements Runnable {
    private final char c;

    public ThreadExampleRunnable02(char c) {
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
            Thread.yield();  //ele basicamente da um indicativo que eu quero dar uma pausa na execução da thread
            //mudando o estado de running (rodando) para runnable (pronto para rodar), mas não há garantia de que ocorrerá essa pausa de fato
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable02('A'),"T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable02('B'),"T2B");
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();
        // esse metodo faz com que só sejam ativas/iniciadas outros threads quando for finalizado o que a t1 precisar fazer,
        // ue nesse caso seria imprimir 100x a letra A
        t2.start();
    }
}
