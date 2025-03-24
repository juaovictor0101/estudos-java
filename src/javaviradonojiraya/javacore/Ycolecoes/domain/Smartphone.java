package javaviradonojiraya.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*Regras do metodo equals:
    Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de NULL;
    Simétrico: para x e y diferente de null, se x.equals(y) == true, logo y.equals(x) == true
    Transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true
    Consistente: x.equals(x) sempre retorna true se x for diferente de null
    Para x diferente de null, x.equals(null) tem que retornar false
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    /*
    Regras Hashcode:

    Se x.equals(y) == true, y.hashCode() == x.hashCode();
    Se y.hashCode() == x.hashCode(), não necessariamente o equals de y.equals(x) tem que ser true;
    Se x.equals(y) == false, o hashCode tem que ser diferente;
    Se y.hashCode() != x.hashCode(), x.equals(y) deverá ser false;

     */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
