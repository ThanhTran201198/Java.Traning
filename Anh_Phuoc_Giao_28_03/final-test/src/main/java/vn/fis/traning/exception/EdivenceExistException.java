package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class EdivenceExistException extends AppException{
	public EdivenceExistException(String message) {
		super(Constants.EvidenceError.EDIVENCE_EXIST, message);
	}
}
