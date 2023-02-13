package DCS.Backend.Users;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@CrossOrigin(origins= {"*"}, maxAge = 4800, exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
public class UserCreateDTO {

	@NotBlank
	String firstName, lastName, emailAddress;
	
	String middleName;

	@NotNull
	@Min(0)
	Integer contractLength;
	
	
//	Whats being passed into dTO
//	inputs = {firstName: 'firstName', middleName: 'middleName', lastName: 'lastName', contractLength: 1, emailAddress: 'example@example.com'}

	public UserCreateDTO(
			@NotBlank String firstName,
			String middleName,
			@NotBlank String lastName, 
			@NotNull @Min(0) Integer contractLength,
			@NotNull String emailAddress) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.contractLength = contractLength;
		this.emailAddress = emailAddress;
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
