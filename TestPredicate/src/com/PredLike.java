package com;

import org.apache.commons.collections.Predicate;

public class PredLike implements Predicate {

	private String parametro;
	
	@Override
	public boolean evaluate(Object arg0) {
		
		Pessoa p = (Pessoa)arg0;
		if (p.getNome().contains(getParametro())){
			return true;
		}
		return false;
	}

	public String getParametro() {
		return parametro;
	}
	
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

}
