package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest04 {
    public static void main(String[] args) {
       Producer producerToUpdate = Producer.builder().id(2).name("NHK").build();
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findByname("Ei");
//        List<Producer> producers = ProducerService.findAll();
//        log.info("Producers found '{}' ", producers);

//        ProducerService.shorProduceMetaData();
//        ProducerService.showDriveMetaData();
//        ProducerService.showTypeScrollWorking();
        List<Producer> prod = ProducerService.findByNameAndUpdateToUpperCase("Ma");
        log.info("Producers found '{}' ", prod);
    }


}
