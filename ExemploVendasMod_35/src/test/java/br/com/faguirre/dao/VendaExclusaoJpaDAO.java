
package br.com.faguirre.dao;

import br.com.faguirre.dao.jpa.IVendaJpaDAO;
import br.com.faguirre.domain.VendaJpa;
import br.com.faguirre.exceptions.DAOException;
import br.com.faguirre.exceptions.TipoChaveNaoEncontradaException;
import br.com.faguirre.dao.generic.GenericJpaDB1DAO;


public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
