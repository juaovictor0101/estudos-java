package javaviradonojiraya.javacore.ZZGconcorrencia.services;

import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService ex = Executors.newCachedThreadPool();


    public double getPriceSync (String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return  priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices Async for store %s%n", storeName);
        Future<Double> submit = ex.submit(this::priceGenerator);
        return submit;
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices Async for store %s%n", storeName);
      return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator() {
        System.out.printf("%s generatinfg price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown(){
        ex.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
