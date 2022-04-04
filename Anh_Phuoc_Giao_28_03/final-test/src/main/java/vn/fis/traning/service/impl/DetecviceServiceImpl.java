package vn.fis.traning.service.impl;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Detective;
import vn.fis.traning.entity.Person;
import vn.fis.traning.exception.DetectiveNotExistException;
import vn.fis.traning.exception.DeteviceExistException;
import vn.fis.traning.exception.LengthException;
import vn.fis.traning.repo.DetecviceRepo;
import vn.fis.traning.repo.PersonRepo;
import vn.fis.traning.service.DetecviceService;
@Service
@Transactional
public class DetecviceServiceImpl implements DetecviceService{
	@Autowired
	DetecviceRepo detecviceRepo;
	
	@Autowired
	PersonRepo personRepo;
	
	@Override
	public Detective add(Detective detecvice){
		Detective kq=detecviceRepo.findByBadgeNumber(detecvice.getBadgeNumber());
		if(kq!=null) {
			throw new DeteviceExistException("Detective nãy đã tồn tại");
		}
		if(kq!=null)  ;
		Person person= detecvice.getPerson();
		if(person!=null) {
			if(person.getUsername().length()<8 ||person.getUsername().length()>100) throw new LengthException("Username phải có độ dài từ 8 - 100 ký tự");
			if(person.getPassword().length()<8 ||person.getPassword().length()>100) throw new LengthException("Password phải có độ dài từ 8 - 100 ký tự");
			Person kq1=personRepo.findByUsername(person.getUsername());
			if(kq1!=null) throw new LengthException("Person này đã tồn tại");
			detecvice.getPerson().setCreateAt(LocalDateTime.now());
			detecvice.getPerson().setModifiedAt(LocalDateTime.now());
		}
		
		detecvice.setCreateAt(LocalDateTime.now());
		detecvice.setModifiedAt(LocalDateTime.now());
		return detecviceRepo.save(detecvice);
	}

	@Override
	public Detective update(Detective detecvice) {
		Detective kq=detecviceRepo.findByBadgeNumber(detecvice.getBadgeNumber());
		if(kq==null) throw new DetectiveNotExistException("Detective không tồn tại");
		Person person= detecvice.getPerson();
		if(person!=null) {
			if(person.getPassword().length()<8 ||person.getPassword().length()>100) throw new LengthException("Password phải có độ dài từ 8 - 100 ký tự");
			Person kq1=personRepo.findByUsername(person.getUsername());
			detecvice.getPerson().setId(kq.getId());
		}
		
		detecvice.setId(kq.getId());
		detecvice.setCreateAt(kq.getModifiedAt());
		detecvice.setModifiedAt(LocalDateTime.now());
		return detecviceRepo.save(detecvice);
	}

	@Override
	public void delete(Long id) {
		Detective kq=detecviceRepo.findById(id).orElse(null);
		if(kq==null) throw new DetectiveNotExistException("Detective nãy không tồn tại");
		detecviceRepo.deleteById(id);
	}

	@Override
	public Detective findById(Long id) {
		Detective kq=detecviceRepo.findById(id).orElse(null);
		if(kq==null) throw new DetectiveNotExistException("Detective nãy không tồn tại");
		return kq;
	}

}
