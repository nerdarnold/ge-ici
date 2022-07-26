package telcomProject;

import java.util.List;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNo;

	public CorporateCustomer(String companyName, String taxNo, String id, String customerNumber,
			List<Subscription> subscriptions) {
		super(id, customerNumber, subscriptions);
		this.companyName = companyName;
		this.taxNo = taxNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
