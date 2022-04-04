package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.dto.ExceptionDTO;
import vn.fis.traning.entity.Detective;
import vn.fis.traning.exception.AppException;
import vn.fis.traning.exception.DeteviceExistException;
import vn.fis.traning.service.DetecviceService;
@RestController
@RequestMapping("/detecvice")
public class DetecviceController {
	@Autowired
	DetecviceService detecviceService;
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Detective detecvice){
		try {
			return  ResponseEntity.ok(detecviceService.add(detecvice));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
		
	}
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody Detective detecvice){
		try {
			return  ResponseEntity.ok(detecviceService.update(detecvice));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
	}
	@GetMapping("/delete/{id}")
	@ResponseBody
	public ResponseEntity<?> findAll(@PathVariable Long id){
		try {
			detecviceService.delete(id);
			return ResponseEntity.ok("Thanh Cong");
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
		
	}
	@GetMapping("/findById/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable Long id){
		try {
			return ResponseEntity.ok(detecviceService.findById(id));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
		
	}
}
