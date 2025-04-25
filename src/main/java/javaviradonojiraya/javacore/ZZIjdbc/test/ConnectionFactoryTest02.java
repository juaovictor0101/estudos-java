package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepository;
import javaviradonojiraya.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Eiichiro Oda").build();
        Producer producerToUpdate = Producer.builder().id(2).name("nhk").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);


    }

}
