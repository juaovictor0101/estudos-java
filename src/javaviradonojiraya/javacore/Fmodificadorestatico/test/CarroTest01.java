package javaviradonojiraya.javacore.Fmodificadorestatico.test;

import javaviradonojiraya.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro(280, "BMW");
        Carro c2 = new Carro(275, "Mercedes");
        Carro c3 = new Carro(290, "Audi");

//        c1.setVelocidadeLimite(180);
        /*
        exemplo do que comentei, como o atributo 'velocidadeLimite' tem um modificado
        estatico, se eu mudo para o c1 (um dos objetos da classe carro, então os demais são afetados de maneira igual;
        */

        //Porém ao fazer essa alteração usando a variável de referência e não o nome da classe, pode gerar confusão
        //a mandeira certa seria:

        Carro.setVelocidadeLimite(180);
        //Porque assim que deixo claro que eu estou fazendo uma alteração  na CLASSE como
        //um todo e não apenas a um dos objetos da classe;
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
