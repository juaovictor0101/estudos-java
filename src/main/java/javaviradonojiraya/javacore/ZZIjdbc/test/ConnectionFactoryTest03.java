package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
       Producer producerToUpdate = Producer.builder().id(2).name("NHK").build();
        ProducerService.update(producerToUpdate);
    }

}
