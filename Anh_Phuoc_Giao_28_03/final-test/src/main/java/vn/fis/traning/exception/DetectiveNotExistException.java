package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class DetectiveNotExistException extends AppException{
	public DetectiveNotExistException(String message) {
		super(Constants.DetectiveError.DECTIVE_NOT_EXIST , message);
	}
}
