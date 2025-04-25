package javaviradonojiraya.javacore.ZZIjdbc.service;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {


    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    private static void requireValidId(Integer id ){
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for Id");
        }
    }

    public static List <Producer> findAll() {
        return ProducerRepository.findAll();
    }
}
