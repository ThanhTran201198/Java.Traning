package vn.fis.traning.service.impl;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.dto.EvidenceDTO;
import vn.fis.traning.entity.CriminalCase;
import vn.fis.traning.entity.Evidence;
import vn.fis.traning.entity.Storage;
import vn.fis.traning.exception.CriminalCaseExistException;
import vn.fis.traning.exception.EdivenceExistException;
import vn.fis.traning.exception.EdivenceNotExistException;
import vn.fis.traning.exception.StorageExistException;
import vn.fis.traning.repo.CriminalCaseRepo;
import vn.fis.traning.repo.EvidenceRepo;
import vn.fis.traning.repo.StorageRepo;
import vn.fis.traning.service.EvidenceService;
@Service
@Transactional
public class EvidenceServiceImpl implements EvidenceService {
	@Autowired
	EvidenceRepo evidenceRepo;
	
	@Autowired
	CriminalCaseRepo criminalCaseRepo;
	
	@Autowired
	StorageRepo storageRepo;
	@Override
	public Evidence add(EvidenceDTO evidenceDTO) {
		Evidence evidence =evidenceDTO.getEvidence();
		Evidence kq=evidenceRepo.findByNumber(evidence.getNumber());
		if(kq!=null) throw new EdivenceExistException("Evidence đã tồn tại");
		if(evidence.getCriminalCase()==null) throw new CriminalCaseExistException("Evidence phải thuộc 1 CriminalCase");
		CriminalCase kq1=criminalCaseRepo.findByNumber(evidence.getCriminalCase().getNumber());
		if(kq1== null ) throw new CriminalCaseExistException("CriminalCase khong ton tai");
		if(evidence.getStorage()==null) throw new StorageExistException("Evidence phải thuộc 1 Storage");
		Storage kq2=storageRepo.findByName(evidence.getStorage().getName());
		if(kq2== null ) throw new StorageExistException("Storage khong ton tai");
		
		
		evidence.setCreateAt(LocalDateTime.now());
		evidence.setModifiedAt(LocalDateTime.now());
		return evidenceRepo.save(evidence);
	}

	@Override
	public Evidence update(Evidence evidence) {
		evidence.setModifiedAt(LocalDateTime.now());
		return evidenceRepo.save(evidence);
	}

	@Override
	public void delete(Long id) {
		evidenceRepo.deleteById(id);
		
	}

	@Override
	public Evidence findById(Long id) {
		return evidenceRepo.findById(id).orElse(null);
	}
}
