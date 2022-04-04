package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class PersonExistException extends AppException{
	public PersonExistException(String message) {
		super(Constants.DetectiveError.PERSON_EXIST, message);
	}
}
