package javaviradonojiraya.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250.0;

    //Quando se usa o modificador estático, a variável se torna "parte" da classe carro em sí e não mais apenas ao objeto
    //Ou seja, todos os objetos que forem criados a partir da classe Carro, terão os valores que forem informados, meio
    //que o modificador estatico transforma todos os atributos do objetos criados a partir da classe carro, um  só, se eu alterar a velocidade
    // limite do c1 nesse caso, eu alteraria de todos;

    public Carro(double velocidadeMaxima, String marca) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.marca = marca;

    }

    public void imprime() {
        System.out.println("----------------------");
        System.out.println("Marca do carro é " + this.marca);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite( double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
        //Não é usado dessa forma, porque por ser um metodo static, ele pode existir/ser chamado mesmo sem a criação de
        // um objeto, e o this. (variável) faz referência a uma variável do objeto e não da CLASSE, que é o que o
        // metodo quando tem um modificado static se torna
        //SÓ é possível usar variáveis do tipo static em metodos static, pois um metodo static independe da necessidade
        // de existir um objeto em memória, visto que ele altera a classe, diferente de um metodo não-static

    }

    public static double getVelocidadeLimite (){
        return Carro.velocidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
