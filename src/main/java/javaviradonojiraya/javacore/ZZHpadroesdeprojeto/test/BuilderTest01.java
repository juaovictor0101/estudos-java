package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderTest01 {
   public static void main(String[] args) {
       //criando um novo objeto sem usar o builder:
//       Person person1 = new Person("João", "Santos", "jaum", "joao@teste.com");


       //criando um novo objeto usando o builder
       Person build = new Person.PersonBuilder()
               .firstName("João")
               .lastName("Victor")
               .userName("jaum")
               .email("Joao@teste.com")
               .build();
       System.out.println(build);
   }
}
