package javaviradonojiraya.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {

    //Classes locais = classes criadas dentro de um metodo.
    private String name = "Kakashi";
    void print (){
        class LocalClass{
            final String lastName = " Hatake"; //atributos dentro da classe local, precisam ser efetivamente finais ou final, ou seja, uma vez declarados, não podem ser mudados;
            public void printLocal (String param){
                //O mesmo vale para parametros ao serem passados em metodos de classes locais
                System.out.println(name + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
//        localClass.printLocal(param);
    }
    public static void main(String[] args) {
            OuterClassesTest02 outer = new OuterClassesTest02();
            outer.print();
    }
}
