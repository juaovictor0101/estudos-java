package javaviradonojiraya.javacore.ZZGconcorrencia.test;

import javaviradonojiraya.javacore.ZZGconcorrencia.domain.Quote;
import javaviradonojiraya.javacore.ZZGconcorrencia.services.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
//        searchPricesWithDiscount(service);
        searchPricesWithDiscountAsync(service);


    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) //return: store:price:code
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> completableFutures = stores.stream()
                //Pegando o preço assincrono = storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                // Isntanciando um novo Quote da string gerada pelo preço getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                //Compondo o primeiro completableFuture
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .collect(Collectors.toList());
        completableFutures.stream()
                .map(CompletableFuture:: join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));

    }
}
