package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Machine;



@Repository
public interface MachineRepository extends JpaRepository<Machine,Long> {

}
