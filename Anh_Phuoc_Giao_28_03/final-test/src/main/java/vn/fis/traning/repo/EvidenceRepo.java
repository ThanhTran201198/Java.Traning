package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.fis.traning.entity.Evidence;

public interface EvidenceRepo extends JpaRepository<Evidence, Long>{
	Evidence findByNumber(String number);
}
