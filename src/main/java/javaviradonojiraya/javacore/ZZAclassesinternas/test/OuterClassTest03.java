package javaviradonojiraya.javacore.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "João Victor";

    static class Nested {
        private String lastName = "Dos Santos";

        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
