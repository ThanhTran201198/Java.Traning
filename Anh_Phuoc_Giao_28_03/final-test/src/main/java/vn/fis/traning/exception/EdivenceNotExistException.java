package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class EdivenceNotExistException extends AppException{
	public EdivenceNotExistException(String message) {
		super(Constants.EvidenceError.EDIVENCE_NOT_EXIST, message);
	}
}