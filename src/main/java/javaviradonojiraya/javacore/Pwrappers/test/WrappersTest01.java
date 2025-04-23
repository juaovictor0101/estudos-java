package javaviradonojiraya.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        /*
        WraWWer = objeto/classe que encapsula tipos Primitivos, e por serem objetos, tem alguns metodos que podem ser
        úteis
         */


        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10.0F;
        double doubleP = 100;
        char charP = 'M';
        boolean boooleanP = false;

        //Para transformar um tipo primitivo em um wrapper, basta mudar a letra inicial para maiscula;
        // Com exceção de int e char, que viram Integer e Character

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'J';
        Boolean booleanW = false;


        int i = intW; //Unboxing
        Integer  intW2 = Integer.parseInt("1");
        floatW.toString();

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isUpperCase('B'));
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('B'));

    }
}
