package javaviradonojiraya.javacore.ZZGconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails (){
        lock.lock();
        try{
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    /*
    De forma bem rasa, wait deixa os threads em espera para serem executados quando determinada condição seja atendida,
    ao ser atendida, é informado por meio de um notify (informa apenas uma thread) ou um notifyAll (notifica todas as threads) em espera por aquele recurso
    fazendo que ela vão uma por uma verifcar novamente se a condição está sendo atendida

    os 3 metodos citados precisam estar em um bloco sincronizado ou em um metodo sincronizado
     */
    public void addMemberEmail( String email){
        lock.lock();
        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista ");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail () throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails" );
        lock.lock();
        try{
            while (this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel na lista, entrando em modo de espera...");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close (){
        open = false;
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ " Notificando todo mundo que não estamos mais pegando emails.");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
