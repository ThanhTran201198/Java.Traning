package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class CriminalCaseNotExistException extends AppException{
	public CriminalCaseNotExistException(String message) {
		super(Constants.CrinimalCaseError.CRIMINALCASE_NOT_EXIST, message);
	}
}
