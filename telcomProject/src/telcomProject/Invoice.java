package telcomProject;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private String id;
	private List<Subscription> subscriptions;
	private LocalDate dateCreated;
	private LocalDate dueDate;

	public Invoice(String id, List<Subscription> subscriptions, LocalDate dateCreated, LocalDate dueDate) {
		super();
		this.id = id;
		this.subscriptions = subscriptions;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
