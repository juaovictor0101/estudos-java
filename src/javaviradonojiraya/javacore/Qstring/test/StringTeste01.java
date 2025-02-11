package javaviradonojiraya.javacore.Qstring.test;

public class StringTeste01 {
    public static void main(String[] args) {

        //Strings são imutáveis em Java

        String nome = "João"; //Pool de string ou String constant pool
        String nome2 = "João";
        nome.concat(" victor");
        System.out.println(nome);
        System.out.println(nome == nome2); //Duas variáveis de referência diferentes, fazendo referência a mesma String
        //Com strings são imutáveis, nesse exemplo acima o nome se mantem o mesmo após a concatenação de 'victor' ao 'joão'

        //A não ser que haja uma nova associação, o valor da string se mantem o mesmo
        System.out.println("------------------------");
        nome = nome.concat(" Victor"); // Isso é equivalente a  nome += " Victor";

        System.out.println(nome);
        System.out.println(nome == nome2); //Comparando os valores de referência na memória
        //Com uma nova associação, o valor a quem a variável 'nome' está referenciando muda;

        System.out.println("------------------------");
        String nome3 = new String("João"); //Ao fazer dessa forma, eu crio uma variável de referência a um objeto do tipo string, que busca uma string criada no pool de String
        System.out.println(nome2 ==nome3); //Fazem referência a dois valores diferentes na memória
        System.out.println(nome2 == nome3.intern());



    }
}
