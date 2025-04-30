package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest05 {
    public static void main(String[] args) {
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("NHK");
//       log.info(producers);

        Producer producerToUpdate = Producer.builder().id(2).name("NHK2").build();
        ProducerRepositoryRowSet.UpdateCachedRowSet(producerToUpdate);
//        log.info("-------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info(producers);


    }
}
