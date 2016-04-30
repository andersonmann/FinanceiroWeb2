package br.com.sisnema.financeiroweb.negocio;

import br.com.sisnema.financeiroweb.dao.IDAO;

/**
 * Classe pai de todas as classes de negócio
 * 
 * @author Anderson Mann
 *
 * @param <T> Entidade a ser persistida/pesquisada
 */

public abstract class RN<T> implements IRN<T> {

	/**
	 * Atributo generico a TODAS as RNs para operações padrões às DAOs
	 */
	protected final IDAO<T> dao;

	/**
	 * Construtor para inicializar a instancia da DAO
	 */
	public RN(IDAO<T> dao) {
		super();
		this.dao = dao;
	}

}
