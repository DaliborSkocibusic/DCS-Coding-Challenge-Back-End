package DCS.Backend.Users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column
	String firstName;
	@Column
	String middleName;
	@Column
	String lastName;
	@Column
	Integer contractLength;
	@Column
	String emailAddress;

	public User() {

	}

	public User(
			String firstName,
			String middleName,
			String lastName,
			Integer contractLength,
			String emailAddress) {
	
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.contractLength = contractLength;
	this.emailAddress = emailAddress;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public Integer getContractLength() {
		return contractLength;
	}

	public void setcontractLength(Integer contractLength) {
		this.contractLength = contractLength;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
