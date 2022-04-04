package vn.fis.traning.service.impl;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;	
import vn.fis.traning.entity.CriminalCase;
import vn.fis.traning.entity.Detective;

import vn.fis.traning.entity.Working_Detective_Case;
import vn.fis.traning.exception.CriminalCaseExistException;
import vn.fis.traning.exception.CriminalCaseNotExistException;
import vn.fis.traning.exception.DetectiveNotExistException;
import vn.fis.traning.repo.CriminalCaseRepo;
import vn.fis.traning.repo.DetecviceRepo;
import vn.fis.traning.repo.WorkRepo;
import vn.fis.traning.service.CriminalCaseService;

@Service
public class CriminalCaseServiceImpl implements CriminalCaseService{
	@Autowired
	CriminalCaseRepo criminalCaseRepo;
	
	@Autowired
	DetecviceRepo detecviceRepo;
	
	@Override
	public CriminalCase add(CriminalCase criminalCase) {
		CriminalCase kq=criminalCaseRepo.findByNumber(criminalCase.getNumber());
		if(kq!=null) throw new CriminalCaseExistException("CriminalCase đã tồn tài");
		Set<Working_Detective_Case> lst=criminalCase.getWorkingSet();
		if(lst!=null)
		for(Working_Detective_Case w:lst) {
			Detective detective=detecviceRepo.findByBadgeNumber(w.getDetective().getBadgeNumber());
			if(detective==null) throw new DetectiveNotExistException("Detective không tồn tại");
			w.setDetective(detective);
		}
		criminalCase.setWorkingSet(lst);
		criminalCase.setCreateAt(LocalDateTime.now());
		criminalCase.setModifiedAt(LocalDateTime.now());
		return criminalCaseRepo.save(criminalCase);
	}

	@Override
	public CriminalCase update(CriminalCase criminalCase) {
		CriminalCase kq=criminalCaseRepo.findByNumber(criminalCase.getNumber());
		if(kq==null) throw new CriminalCaseNotExistException("CriminalCase không tồn tài");
		Set<Working_Detective_Case> lst=criminalCase.getWorkingSet();
		if(lst!=null)
		for(Working_Detective_Case w:lst) {
			Detective detective=detecviceRepo.findByBadgeNumber(w.getDetective().getBadgeNumber());
			if(detective==null) throw new DetectiveNotExistException("Detective không tồn tại");
			w.setDetective(detective);
		}
		criminalCase.setId(kq.getId());
		criminalCase.setWorkingSet(lst);
		criminalCase.setModifiedAt(LocalDateTime.now());
		return criminalCaseRepo.save(criminalCase);
	}

	@Override
	public void delete(Long id) {
		CriminalCase kq = criminalCaseRepo.findById(id).orElse(null);
		if(kq==null) throw new CriminalCaseNotExistException("CriminalCase không tồn tài");
		criminalCaseRepo.deleteById(id);
	}

	@Override
	public CriminalCase findById(Long id) {
		CriminalCase kq = criminalCaseRepo.findById(id).orElse(null);
		if(kq==null) throw new CriminalCaseNotExistException("CriminalCase không tồn tài");
		return kq;
	}
	
}
