package br.com.alura.screenmatch.desafios;

public class Pessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Seu nome é: " + this.getNome() + " e você tem " + this.getIdade() + " anos!";
    }
}
