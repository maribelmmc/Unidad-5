package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.UserPorfile;




@Repository
public interface UserPorfileRepository extends JpaRepository<UserPorfile,Long> {

}
