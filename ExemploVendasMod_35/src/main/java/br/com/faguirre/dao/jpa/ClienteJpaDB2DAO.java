
package br.com.faguirre.dao.jpa;

import br.com.faguirre.dao.generic.GenericJpaDB2DAO;
import br.com.faguirre.domain.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
