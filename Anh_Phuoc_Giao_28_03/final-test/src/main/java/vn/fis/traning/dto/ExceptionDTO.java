package vn.fis.traning.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDTO {	
	private LocalDateTime timestamp;
	private String status;
	private String error;
	
}
