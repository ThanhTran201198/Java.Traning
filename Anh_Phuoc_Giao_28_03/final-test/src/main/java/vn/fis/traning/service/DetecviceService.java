package vn.fis.traning.service;

import vn.fis.traning.entity.CriminalCase;
import vn.fis.traning.entity.Detective;

public interface DetecviceService{
	Detective add(Detective detecvice);
	Detective update(Detective detecvice);
	void delete(Long id);
	Detective findById(Long id);
}
