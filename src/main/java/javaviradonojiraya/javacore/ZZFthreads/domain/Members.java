package javaviradonojiraya.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails (){
        synchronized (emails){
            return emails.size();
        }
    }

    /*
    De forma bem rasa, wait deixa os threads em espera para serem executados quando determinada condição seja atendida,
    ao ser atendida, é informado por meio de um notify (informa apenas uma thread) ou um notifyAll (notifica todas as threads) em espera por aquele recurso
    fazendo que ela vão uma por uma verifcar novamente se a condição está sendo atendida

    os 3 metodos citados precisam estar em um bloco sincronizado ou em um metodo sincronizado
     */
    public void addMemberEmail( String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista ");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail () throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails" );
        synchronized (this.emails){
            while (this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel na lista, entrando em modo de espera...");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close (){
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName()+ " Notificando todo mundo que não estamos mais pegando emails.");
            this.emails.notifyAll();
        }
    }
}
