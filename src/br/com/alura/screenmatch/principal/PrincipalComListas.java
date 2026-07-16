package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9.2);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoMario = new Filme("Bastardos Inglórios", 2009);
        filmeDoMario.avalia(9);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoMario;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoMario);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao() );
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Mário");
        buscaPorArtista.add("Luigi");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: \n" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de títulos ordenados por ano: \n" + lista);

    }
}
