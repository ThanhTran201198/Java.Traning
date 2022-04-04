package vn.fis.traning.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Entity
@Data
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractEntity implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	private int version;
//	private LocalDateTime createAt;
//	private LocalDateTime modifiedAt;
}
