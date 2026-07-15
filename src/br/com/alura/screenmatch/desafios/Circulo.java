package br.com.alura.screenmatch.desafios;

public class Circulo implements Forma {
    public double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
