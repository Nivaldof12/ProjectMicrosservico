/**
 * 
 */
package br.com.nivaldo.vendas.online.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.nivaldo.vendas.online.domain.Venda;
import br.com.nivaldo.vendas.online.exception.EntityNotFoundException;
import br.com.nivaldo.vendas.online.repository.IVendaRepository;

/**
 * @author nivaldo
 *
 */
@Service
public class BuscaVenda {

	private IVendaRepository vendaRepository;
	
	@Autowired
	public BuscaVenda(IVendaRepository produtoRepository) {
		this.vendaRepository = produtoRepository;
	}
	
	public Page<Venda> buscar(Pageable pageable) {
		return vendaRepository.findAll(pageable);
	}

	public Venda buscarPorCodigo(String codigo) {
		return vendaRepository.findByCodigo(codigo)
				.orElseThrow(() -> new EntityNotFoundException(Venda.class, "codigo", codigo));
	}

	
}
