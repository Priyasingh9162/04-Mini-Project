package priya.in.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Ed_Module")
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	@Column(name="Full_Name")
	private String fullName;
	@Column(name="Email")
	private String email;
	@Column(name="Mobile")
	private String mobile;
	@Column(name="Gender")
	private String gender;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="SSN")
	private String ssl;
	
}
