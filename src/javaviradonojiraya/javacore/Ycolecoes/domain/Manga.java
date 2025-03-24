package javaviradonojiraya.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(nome, "Nome não pode ser null.");
        Objects.requireNonNull(id, "Id não pode ser null.");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //se this <outroManga, retorna negativo (-1)
        //se this == outroManga, retorna neutro (0)
        //se this >outroManga, retorna positivo (+1)
//        if (this.id < outroManga.getId()) {
//            return -1;
//        }else if (this.id.equals(outroManga.getId())){
//            return 0;
//        }else {
//            return 1;
//        }

        /*
        Ou ao inves de implementar um metodo proprio é possível usar os proprios do java como nos exemplos a seguir:
         */

        return this.nome.compareTo(outroManga.getNome()); //Coloca em ordem alfabetica
        return Double.compare(preco, outroManga.getPreco()); //Coloca em ordem do menor para o maior
        return Double.valueOf(preco).compareTo(outroManga.getPreco()); //Coloca em ordem do menor para o maior
        return this.id.compareTo(outroManga.getId()); //Coloca em ordem do menor para o maior (ID)
    }
}
