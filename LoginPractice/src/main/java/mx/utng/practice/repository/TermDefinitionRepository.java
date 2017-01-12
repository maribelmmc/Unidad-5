package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.TermDefinition;



@Repository
public interface TermDefinitionRepository extends JpaRepository<TermDefinition,Long> {

}
