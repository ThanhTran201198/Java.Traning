package vn.fis.traning.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode (callSuper = true)
public class Detective extends AbstractEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int version;
	private LocalDateTime createAt;
	private LocalDateTime modifiedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personId",referencedColumnName = "id")
	private Person person;
	
	private String badgeNumber;
	private Rank rankz;
	private Boolean armed;
	private EmploymentStatus status;	

}
