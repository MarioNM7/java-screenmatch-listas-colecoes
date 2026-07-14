import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.desafios.Pessoa;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.desafios.Produto;
import br.com.alura.screenmatch.desafios.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoMario = new Filme("Bastardos Inglórios", 2009);
        //filmeDoMario.setNome("Bastardos Inglórios");
        //filmeDoMario.setAnoDeLancamento(2009);
        filmeDoMario.getDuracaoEmMinutos();
        filmeDoMario.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoMario);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.printf("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.printf("toString do filme: " + listaDeFilmes.get(0).toString());





        //testes
        //int[] numeros = new int[5];
        //for (int i = 0; i < numeros.length; i++) {
        //    numeros[i] = i + 1;
        //    System.out.println(i+1);
        //}

        //Desafios

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
        System.out.println(listaDePessoas); */

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

    }
}