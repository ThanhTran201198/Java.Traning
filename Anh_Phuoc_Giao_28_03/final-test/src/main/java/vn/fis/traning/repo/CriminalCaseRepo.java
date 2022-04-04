package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.CriminalCase;

public interface CriminalCaseRepo extends JpaRepository<CriminalCase, Long>{
	CriminalCase findByNumber(String number);
}
