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
		pred.setParametro("an");
		
		@SuppressWarnings("unchecked")
		Collection<Pessoa> listaRes = CollectionUtils.predicatedCollection(
				lista, pred);
		
		for (Pessoa a : lista){
			System.out.println(a.getNome());
		}
		
		for (Pessoa a : listaRes){
			System.out.println(a.getNome());
		}
		
	}
	
	public static void main(String[] args) {
		new Teste().teste();
	}
}

