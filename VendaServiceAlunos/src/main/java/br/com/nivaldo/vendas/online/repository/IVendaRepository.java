/**
 * 
 */
package br.com.nivaldo.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.nivaldo.vendas.online.domain.Venda;

/**
 * @author nivaldo
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
