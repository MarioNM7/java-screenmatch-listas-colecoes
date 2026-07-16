package br.com.alura.screenmatch.desafios;

public class TituloDesafio implements Comparable<TituloDesafio> {
    private String nome;
    private int anoDeLancamento;
    private String diretor;

    public TituloDesafio(String nome, int anoDeLancamento,  String diretor) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int compareTo(TituloDesafio outroTituloD) {
        return this.nome.compareTo(outroTituloD.nome);
    }
}
