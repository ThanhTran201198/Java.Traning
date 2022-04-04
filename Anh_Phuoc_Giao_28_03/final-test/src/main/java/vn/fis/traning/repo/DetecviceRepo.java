package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Detective;

public interface DetecviceRepo extends JpaRepository<Detective, Long>{
	Detective findByBadgeNumber(String badgeNumber);
}
