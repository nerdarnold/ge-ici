package telcomProject;

import java.time.LocalDate;
import java.util.List;

public class Subscription {
	private int id;
	private String customerId;
	private LocalDate dateStarted;
	private String serviceId;
	private List<Invoice> invoices;

	public Subscription(int id, String customerId, LocalDate dateStarted, String serviceId, List<Invoice> invoices) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.dateStarted = dateStarted;
		this.serviceId = serviceId;
		this.invoices = invoices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public LocalDate getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

}
