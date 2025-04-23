package javaviradonojiraya.javacore.ZZFthreads.test;

import javaviradonojiraya.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Naruto");
        Thread t2 = new Thread(threadAccountTest01, "Jiraya");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Deu ruim");
            }
        }

    }

    //para lidar com a concorrência de threads, usando do sicronismo , pode se usar o "synchronized", que faz com que quando uma thread inicie um metodo, outra nao possa entrar durante sua execução
    //essa palavra reservada pode ser declarada tanto no metodo, quanto no atributo especifico, para que um bloco de código especifico do metodo seja executado sem interrupções;

    //exemplo com metodo synchronized
//    private synchronized void withdrawal (int amount){
//        if (account.getBalance() >= amount){
//            System.out.println(getThreadName() + " Está indo sacar sacar dinheiro");
//            account.whithdrawal(amount);
//            System.out.println(getThreadName() + " Completou o saque, valor atual da conta: "+ account.getBalance());
//        }else {
//            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
//        }
//    }

    //exemplo com atributo synchronized, é preciso declarar o atributo que sera synchronized como final
    private void withdrawal(int amount) {
        System.out.println(getThreadName()+ "#### fora do synchronized ");
        synchronized (account) {
            System.out.println(getThreadName()+ "**** dentro do synchronized ");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " Está indo sacar sacar dinheiro");
                account.whithdrawal(amount);
                System.out.println(getThreadName() + " Completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
