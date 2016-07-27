package com.github.cloud.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.coffey.architecture.common.AbstractCommonDAO;
import com.coffey.architecture.common.CommonBean;

public abstract class AbstractCommonProjectDAO extends AbstractCommonDAO<CommonBean> {

	/**Genereted serial uid version. */
	private static final long serialVersionUID = -1876303764348922581L;
	
	/** {@link EntityManager} para acesso ao banco de dados. */
	@PersistenceContext(unitName="CommonProjectPersistenceUnit", type=PersistenceContextType.TRANSACTION )
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.coffey.architecture.common.AbstractCommonDAO#getEntityManager()
	 */
	@Override
	protected EntityManager getEntityManager() {
		return this.entityManager;
	}
	
}
