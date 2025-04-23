package javaviradonojiraya.javacore.ZZGconcorrencia.test;

import javaviradonojiraya.javacore.ZZGconcorrencia.services.StoreService;
import javaviradonojiraya.javacore.ZZGconcorrencia.services.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService){
        long  start = System.currentTimeMillis();
        List<String>  stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<CompletableFuture<Double>> completableFuture = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFuture.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }

}
