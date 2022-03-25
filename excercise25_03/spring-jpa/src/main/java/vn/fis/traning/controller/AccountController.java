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

import vn.fis.traning.entity.Account;
import vn.fis.traning.service.AccountService;


@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("/save")
	@ResponseBody
	public ResponseEntity<?> save (@RequestBody Account account) {
		return ResponseEntity.ok(accountService.update(account));
	}
	
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update (@RequestBody Account account) {
		return ResponseEntity.ok(accountService.update(account));
	}
	
	@GetMapping("/delete/{accountId}")
	@ResponseBody
	public ResponseEntity<?> delete (@PathVariable Long accountId) {
		accountService.delete(accountId);
		return ResponseEntity.ok("Done!");
	}
	
	@GetMapping("/getById/{accountId}")
	@ResponseBody
	public ResponseEntity<?> getById (@PathVariable Long accountId) {
		return ResponseEntity.ok(accountService.getById(accountId));
	}
	@GetMapping("/getByFullName/{fullname}")
	@ResponseBody
	public ResponseEntity<?> getByFullName (@PathVariable String fullname) {
		return ResponseEntity.ok(accountService.getByFullname(fullname));
	}
}
