package javaviradonojiraya.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal andando....");
    }
}

//2- Fazendo com que esse tipo de caso não seja necessário.
class Cachorro extends Animal {
    @Override
    public void walk() {
        System.out.println("Cachorro andando...");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        //1- Classes anônimas surgiram para que não seja necessaria a criação de uma nova classe que herde o metodo de uma super classe, para ai altera-la
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Agora eu estou manipulando um metodo da classe usando uma classe anonima, e agora: Cachorro andando...");
            }
        };
        animal.walk();
    }

}
