package vn.fis.traning.service;

import vn.fis.traning.dto.EvidenceDTO;
import vn.fis.traning.entity.CriminalCase;
import vn.fis.traning.entity.Evidence;

public interface EvidenceService {
	Evidence add(EvidenceDTO evidenceDTO);
	Evidence update(Evidence evidence);
	void delete(Long id);
	Evidence findById(Long id);
}
