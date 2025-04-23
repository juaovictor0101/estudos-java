package javaviradonojiraya.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Naruto Uzumaki";

    //Nested Classes ou Classes Aninhadas:
    class Inner{
        public void printOuterClassAttribute () {
            System.out.println(name);
            System.out.println(this); //O this sempre faz referencia ao objeto ao qual ele foi associado, nesse caso a classe interna
            System.out.println(OuterClassesTest01.this); //forma de refereciar a classe externa a partir da interna com o this.
        }
    }
    public static void main(String[] args) {
        //Formas de declarar uma classe interna:
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        OuterClassesTest01.Inner inner = outerClass.new Inner();
        Inner inner2 = outerClass.new Inner();
        Inner inner3 = new OuterClassesTest01().new Inner();


        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
        inner3.printOuterClassAttribute();
    }
}
