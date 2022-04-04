package vn.fis.traning.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AppException extends RuntimeException{
	private String code;
	private LocalDateTime timestamp;
	public AppException(String code, String message) {
		super(message);
		this.code=code;
		this.timestamp=LocalDateTime.now();
	}
}
