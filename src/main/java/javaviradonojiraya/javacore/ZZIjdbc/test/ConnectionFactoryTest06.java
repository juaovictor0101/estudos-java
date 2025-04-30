package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest06 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Lioto Mashida").build();
        Producer producer2 = Producer.builder().name("Anderson Silva").build();
        Producer producer3 = Producer.builder().name("Charles do Bronxs").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));

    }
}
