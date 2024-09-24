package polimorfismo;

import polimorfismo.Conteudo;
import polimorfismo.Filme;
import polimorfismo.Serie;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	    public static void main(String[] args) {
	        List<Conteudo> catalogo = new ArrayList<>();

	        catalogo.add(new Filme("A��o", " Avatar ", 162));
	        catalogo.add(new Filme("A��o", "Vingadores: Ultimato ", 180));
	        catalogo.add(new Filme("Fic��o Cientifica", "Avatar: O Caminho da �gua", 192));
	        catalogo.add(new Filme("Anima��o", "Divertida Mente 2 ", 96));
	        catalogo.add(new Filme("A��o", "Jurassic World", 124));

	        catalogo.add(new Serie("A��o", "Dinastia", 40, 108, 4));
	        catalogo.add(new Serie("Drama", "Elite", 50, 64, 8));
	        catalogo.add(new Serie("Com�dia", "Sex education", 27, 32, 4));
	        catalogo.add(new Serie("Terror", "Stranger Things", 50, 34, 4));
	        catalogo.add(new Serie("Romance", "HeartStopper",30 , 16, 3));

	        for(Conteudo conteudo : catalogo){
	            System.out.println(conteudo.descricao());
	            System.out.println();
	        }
	    }
	}


