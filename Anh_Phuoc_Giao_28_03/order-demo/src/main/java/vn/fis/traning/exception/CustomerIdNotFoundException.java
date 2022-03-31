package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class CustomerIdNotFoundException extends AppException{
	private Long customerId;

	public CustomerIdNotFoundException(String message, Long customerId) {
		super(Constants.CustomerError.ID_NOT_FOUND, message);
		this.customerId = customerId;
	}
}
