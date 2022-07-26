package telcomProject;

import java.util.List;

public class Customer {
	private String id;
	private String customerNumber;
	private List<Subscription> subscriptions;

	public Customer(String id, String customerNumber, List<Subscription> subscriptions) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.subscriptions = subscriptions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

}
