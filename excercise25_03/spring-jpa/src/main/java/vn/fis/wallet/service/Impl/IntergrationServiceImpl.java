package vn.fis.wallet.service.Impl;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import lombok.Data;
import vn.fis.wallet.dto.AccountDto;
import vn.fis.wallet.service.IntergrationService;

public class IntergrationServiceImpl implements IntergrationService{

	@Override
	public Object getAllAccount() {
		RestTemplate restTemplate =new RestTemplate();
		String url ="http://localhost:7888/account/getByFullname/Thành Trần";
		AccountDto[] list=restTemplate.getForObject(url,AccountDto[].class);
		return list;
	}
	
	@Data
	class AccountWrapper{
		List<AccountDto> listAccount;
	}
}
