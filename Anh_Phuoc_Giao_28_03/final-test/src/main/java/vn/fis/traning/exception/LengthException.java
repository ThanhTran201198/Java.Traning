package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class LengthException extends AppException{
	public LengthException(String message) {
		super(Constants.DetectiveError.LENGTH, message);
	}
}
