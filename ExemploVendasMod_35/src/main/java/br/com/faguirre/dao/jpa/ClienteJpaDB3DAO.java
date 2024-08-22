
package br.com.faguirre.dao.jpa;

import br.com.faguirre.dao.generic.GenericJpaDB3DAO;
import br.com.faguirre.domain.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
