package vn.fis.traning.exception;

import vn.fis.traning.Constants;

public class StorageExistException extends AppException{
	public StorageExistException(String message) {
		super(Constants.StorageError.STORAGE_EXIST, message);
	}
}
