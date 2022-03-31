package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{
}
