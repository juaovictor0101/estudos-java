package javaviradonojiraya.javacore.ZZKjunit.test;

import javaviradonojiraya.javacore.ZZKjunit.domain.Person;
import javaviradonojiraya.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is a adult? '{}' ", personService.isAdult(person));
    }
}
