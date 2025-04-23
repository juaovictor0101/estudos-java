package javaviradonojiraya.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name) {
        names.add(name);
    }


    /*
    Ao usar uma classe que é thread safe, precisa ter atenção ao criar novos métodos que farão novas operações ou que irão
    contem novas regras, sendo necessário a sincronização também desses métodos para evitar erros.
     */
    public synchronized void removeFirst (){
        if (names.size()> 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

//Classes com thread safe( métodos sincronizados)
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Jirarya");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
