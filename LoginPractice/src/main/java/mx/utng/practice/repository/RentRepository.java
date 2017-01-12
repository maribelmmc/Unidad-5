package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Rent;


@Repository
public interface RentRepository extends JpaRepository<Rent,Long> {

}
