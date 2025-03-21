package br.edu.ifrs.osorio.tads.aulabanco.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.ifrs.osorio.tads.aulabanco.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
