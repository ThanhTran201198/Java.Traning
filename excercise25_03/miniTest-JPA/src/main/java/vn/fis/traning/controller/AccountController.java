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
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Account account){
		Account a =new Account();
		return  ResponseEntity.ok(accountService.addAccount(account));
	}
	
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> save(@RequestBody Account account){
		return  ResponseEntity.ok(accountService.updateAccount(account));
	}
	
	@GetMapping("/delete/{accountId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable Long accountId){
		accountService.deleteAccount(accountId);
		return ResponseEntity.ok("Done!");
	}
	@GetMapping("/findById/{accountId}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable Long accountId){
		return ResponseEntity.ok(accountService.findById(accountId));
	}
	@GetMapping("/getById/{accountId}")
	@ResponseBody
	public ResponseEntity<?> getById (@PathVariable Long accountId) {
		return ResponseEntity.ok(accountService.findById(accountId));
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok(accountService.findAllAccount());
	}
	
	
}
