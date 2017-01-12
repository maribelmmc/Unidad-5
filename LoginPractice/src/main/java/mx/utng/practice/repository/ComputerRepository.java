package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Computer;



@Repository
public interface ComputerRepository extends JpaRepository<Computer,Long> {

}
