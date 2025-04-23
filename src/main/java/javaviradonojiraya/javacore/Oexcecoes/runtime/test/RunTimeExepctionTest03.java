package javaviradonojiraya.javacore.Oexcecoes.runtime.test;

public class RunTimeExepctionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {

        try {
            System.out.println("Abrindo arquivo ");
            System.out.println("Escrevendo no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso");
        }
        return null;
    }

    private static String abreConexao2() {

        try {
            System.out.println("Abrindo arquivo ");
            System.out.println("Escrevendo no arquivo");
            return "Conexão aberta";
        } finally {
            System.out.println("Fechando recurso");
        }
    }

    /*
     Usar "finnally", é um bloco de código que SEMPRE é executado, independente do que aconteça, ele é útil quando há uma
     bloco de código que é necessário ser executado independente do que aconteça, um exemplo citado pelo William foi quando
     há um trabalho com a requisição num banco de dados, que é feita a liberação, manipulação, e é encerrada após o uso,
     em casos de erros nessas situações, caso não tenha um bloco finally há a possibilidade da requisição não ser
     finalizada e caso haja um alto fluxo de requisições, crashar o sistema por causa do alto uso de memória por ex.

     Há também a possibilidade de usar try e finally direto, sem o catch, apesar de não ser muito usual. Conforme demosntrado no
     segundo metodo.
     */
}
