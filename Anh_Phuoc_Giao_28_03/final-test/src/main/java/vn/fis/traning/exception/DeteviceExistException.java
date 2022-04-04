package vn.fis.traning.exception;

import java.time.LocalDateTime;

import vn.fis.traning.Constants;
public class DeteviceExistException extends AppException{
	public DeteviceExistException(String message) {
		super(Constants.DetectiveError.DECTIVE_EXIST, message);
	}
}
