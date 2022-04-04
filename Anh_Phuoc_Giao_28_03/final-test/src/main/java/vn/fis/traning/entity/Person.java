package vn.fis.traning.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
//@EqualsAndHashCode (callSuper = true)

public class Person  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int version;
	private LocalDateTime createAt;
	private LocalDateTime modifiedAt;
	
	private String username;
	private String firstName;
	private String lastName;
	private String password;
}
