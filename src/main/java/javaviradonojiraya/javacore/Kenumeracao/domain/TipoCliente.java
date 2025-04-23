package javaviradonojiraya.javacore.Kenumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoPorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null; //criação de metodo que faz busca no baseado no atributo que está sendo passado e retorna um dos atributos, e null caso não seja um dos atributos desejados;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
    //usando construtores em enumerações

    /*enumerações é um tipo especial de classe, onde os atributos associados a ela não podem ser alterados
     é útil quando há uma escolha em um escopo limitado e você quer forçar o usuário/desenvolvedor
    a usarem os tipos pré-definidos, é basicamente a criação de uma constante, mas de uma forma mais ampla e limpa.

     */

}

