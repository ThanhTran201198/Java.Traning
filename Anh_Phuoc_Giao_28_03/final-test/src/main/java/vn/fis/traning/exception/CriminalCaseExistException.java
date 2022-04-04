package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class CriminalCaseExistException extends AppException{
	public CriminalCaseExistException(String message) {
		super(Constants.CrinimalCaseError.CRIMINALCASE_EXIST, message);
	}
}
