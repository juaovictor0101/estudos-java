package javaviradonojiraya.javacore.ZZIjdbc.service;

import javaviradonojiraya.javacore.ZZIjdbc.domain.Producer;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepository;
import javaviradonojiraya.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void UpdateJdbcRowSet(Producer producer) {
    ProducerRepositoryRowSet.UpdateJdbcRowSet(producer);
    }
    public static void UpdateCachedRowSet(Producer producer) {
    ProducerRepositoryRowSet.UpdateCachedRowSet(producer);
    }

}
