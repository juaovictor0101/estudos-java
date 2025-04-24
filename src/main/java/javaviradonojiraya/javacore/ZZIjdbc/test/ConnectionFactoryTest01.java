package javaviradonojiraya.javacore.ZZIjdbc.test;

import javaviradonojiraya.javacore.ZZIjdbc.conn.ConnectionFactory;
import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Eiichiro Oda").build();
        ProducerRepository.save(producer);
        log.info("INFO");
        log.debug("INFO");
        log.warn("INFO");
        log.error("INFO");
        log.trace("INFO");
    }
}
