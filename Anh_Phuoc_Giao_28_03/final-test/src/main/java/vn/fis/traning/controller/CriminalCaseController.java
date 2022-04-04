package vn.fis.traning.controller;

import java.time.LocalDateTime;

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
import vn.fis.traning.entity.CriminalCase;
import vn.fis.traning.exception.AppException;
import vn.fis.traning.service.CriminalCaseService;

@RestController
@RequestMapping("/criminalCase")
public class CriminalCaseController {
	@Autowired
	CriminalCaseService criminalCaseService;
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody CriminalCase criminalCase){
		try {
			return  ResponseEntity.ok(criminalCaseService.add(criminalCase));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
	}
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody CriminalCase criminalCase){
		try {
			return  ResponseEntity.ok(criminalCaseService.update(criminalCase));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
	}
	@GetMapping("/delete/{id}")
	@ResponseBody
	public ResponseEntity<?> findAll(@PathVariable Long id){
		try {
			criminalCaseService.delete(id);
			return ResponseEntity.ok("Thanh Cong");
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
	}
	@GetMapping("/findById/{id}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable Long id){
		try {
			return ResponseEntity.ok(criminalCaseService.findById(id));
		} catch (AppException e) {
			return ResponseEntity.ok(new ExceptionDTO(e.getTimestamp(), e.getMessage(),e.getCode()));
		} 
	}
}
