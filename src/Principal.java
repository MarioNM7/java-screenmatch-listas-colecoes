import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.desafios.Pessoa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos(153));

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos(153));

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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

        var filmeDoMario = new Filme();
        filmeDoMario.setNome("Bastardos Inglórios");
        filmeDoMario.setAnoDeLancamento(2009);
        filmeDoMario.getDuracaoEmMinutos(153);
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
        /* Pessoa pessoa1 = new Pessoa();
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

        
    }
}