package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long>{
	Person findByUsername(String username);
}
