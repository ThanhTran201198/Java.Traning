package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Storage;

public interface StorageRepo extends JpaRepository<Storage, Long>{
	Storage findByName(String name);
}
