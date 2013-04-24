package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class Teste {

	public void teste(){

		Pessoa p = new Pessoa();
		p.setNome("Leandro");

		Pessoa p1 = new Pessoa();
		p1.setNome("Gustavo");

		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(p);
		lista.add(p1);

		PredLike pred = new PredLike();
		pred.setParametro("av");

		@SuppressWarnings("unchecked")
		Collection<Pessoa> filteredCollection = CollectionUtils.select(lista, pred);

		for (Pessoa a : filteredCollection){
			System.out.println(a.getNome());
		}
	}

	public static void main(String[] args) {
		new Teste().teste();
	}
}

