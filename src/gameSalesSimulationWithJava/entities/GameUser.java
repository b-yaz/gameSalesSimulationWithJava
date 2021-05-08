package gameSalesSimulationWithJava.entities;

import java.util.Date;

public class GameUser extends User {
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dateOfBirth;
	
	public GameUser() {
		
	}

	public GameUser(String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public GameUser(int userId, String userName, String password, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		super(userId, userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
