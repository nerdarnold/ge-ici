package telcomProject;

import java.util.List;

public class IndividualCustomer extends Customer {
	private String nationalId;
	private String firstName;
	private String lastName;

	public IndividualCustomer(String nationalId, String firstName, String lastName, String id, String customerNumber,
			List<Subscription> subscriptions) {
		super(id, customerNumber, subscriptions);
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
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

}
