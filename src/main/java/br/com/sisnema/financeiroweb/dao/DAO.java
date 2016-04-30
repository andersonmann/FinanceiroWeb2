package br.com.sisnema.financeiroweb.dao;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import br.com.sisnema.financeiroweb.util.JPAUtil;

/**
 * Classe abstrta que herda os comportamentos de {@link IDAO} e conterá atributos
 * e funcionalidades genéricas a todas as filhas
 * 
 * @author Anderson Mann 
 */

public abstract class DAO<T> implements IDAO<T> {
	/**
	 * Como todas as DAOS irão possuir uma sessão, criaremos a mesma na classe
	 * pai, sendo ela HERDADA pelas filhas...
	 */

	protected final EntityManager em;

	/**
	 * Método construtor de DAO para INICIALIZAR a sessao do hibertnate
	 */

	public DAO() {
		em = JPAUtil.getEntityManager();
	}

	protected final Session getSession() {
		return (Session) em.unwrap(Session.class);
	}
}
