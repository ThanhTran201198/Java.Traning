package vn.fis.traning.service;

import vn.fis.traning.entity.CriminalCase;

public interface CriminalCaseService {
	CriminalCase add(CriminalCase criminalCase);
	CriminalCase update(CriminalCase criminalCase);
	void delete(Long id);
	CriminalCase findById(Long id);
}
