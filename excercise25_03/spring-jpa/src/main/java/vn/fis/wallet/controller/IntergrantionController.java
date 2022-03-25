package vn.fis.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import vn.fis.wallet.service.IntergrationService;

@RestController
@RequestMapping("/integration")
public class IntergrantionController {
	@Autowired
	IntergrationService intergrationService;
	@GetMapping("/getAllAcount")
	@ResponseBody
	public ResponseEntity<?> getAllAccount(){
		return ResponseEntity.ok(intergrationService.getAllAccount());
	}
	
}
