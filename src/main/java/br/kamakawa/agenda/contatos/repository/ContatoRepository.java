package br.kamakawa.agenda.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.kamakawa.agenda.contatos.model.Contato;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepository extends JpaRepository <Contato, Long> {

}
