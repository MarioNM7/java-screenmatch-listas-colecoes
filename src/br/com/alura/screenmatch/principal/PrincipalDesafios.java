package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.desafios.*;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalDesafios {
    public static void main(String[] args) {

        /*Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mário");
        pessoa1.setIdade(18);
        System.out.println(pessoa1.toString());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setIdade(22);
        System.out.println(pessoa2.toString());

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Kuada");
        pessoa3.setIdade(19);
        System.out.println(pessoa3.toString());


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro da lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);*/

        /* Produto produto1 = new Produto("Suco", 5.99, 2);
        Produto produto2 = new Produto("Biscoito", 3.99, 1);
        Produto produto3 = new Produto("Pão", 7.99, 1);

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        System.out.println("\n A lista tem " + listaProduto.size() + " itens!");
        System.out.println("Produto na posição 2: " + listaProduto.get(2).getNome());

        System.out.println(listaProduto);

        Produto outroProduto = new Produto("Vassoura", 15.00, 2);
        System.out.println(outroProduto);

        ProdutoPerecivel produtoVeio = new ProdutoPerecivel("Leite", 7.00, 3, "14/07/2026");
        System.out.println(produtoVeio); */

        /* ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Água");
        listaStrings.add("Fogo");
        listaStrings.add("Terra");
        listaStrings.add("Ar");

        for (String item: listaStrings) {
            System.out.println(item);
        }

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        Produto produto1 = new Produto("Suco", 5.99, 2);
        Produto produto2 = new Produto("Biscoito", 3.99, 1);
        Produto produto3 = new Produto("Pão", 7.99, 1);

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);


        //Para esse desafio eu decidi utilizar a base da classe produto de antes

        double totalProduto = 0;

        for (Produto produto: listaProduto) {
            totalProduto += produto.getPreco();
        }


        double  mediaProduto = totalProduto / listaProduto.size();

        System.out.println("Média do preço dos produtos: " + mediaProduto);

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo()); */

        List<Integer> listaNum = new ArrayList<>();
        listaNum.add(999);
        listaNum.add(101);
        listaNum.add(967);
        listaNum.add(1);
        listaNum.add(-10);
        Collections.sort(listaNum);
        System.out.println("Lista em ordem crescente: " + listaNum);

        TituloDesafio tituloD1 = new TituloDesafio("Filme legal", 1967, "Mário Legal");
        TituloDesafio tituloD2 = new TituloDesafio("Aventura do Luigi", 2067, "Luigi Martins");
        TituloDesafio tituloD3 = new TituloDesafio("Fim da Vargentina", 2030, "Mário NM");

        List<TituloDesafio> listaTituloD = new ArrayList<>();
        listaTituloD.add(tituloD1);
        listaTituloD.add(tituloD2);
        listaTituloD.add(tituloD3);
        Collections.sort(listaTituloD);
        for (TituloDesafio tituloD : listaTituloD) {
            System.out.println(tituloD.getNome());
        }

        /*List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);*/

        //Outra forma
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
