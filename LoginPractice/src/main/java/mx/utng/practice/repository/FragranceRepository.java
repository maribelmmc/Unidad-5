package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import mx.utng.practice.model.Fragrance;



@Repository
public interface FragranceRepository extends JpaRepository<Fragrance,Long> {

}
