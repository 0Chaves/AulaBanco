package br.edu.ifrs.osorio.tads.aulabanco.repository;

import br.edu.ifrs.osorio.tads.aulabanco.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {
}
