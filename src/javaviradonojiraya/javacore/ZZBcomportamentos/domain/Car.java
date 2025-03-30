package javaviradonojiraya.javacore.ZZBcomportamentos.domain;

public class Car {
    private String name = "Audi";
    private String cor;
    private int ano;

    public Car(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
