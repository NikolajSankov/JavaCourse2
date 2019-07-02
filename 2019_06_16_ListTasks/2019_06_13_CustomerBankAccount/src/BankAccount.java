public class BankAccount {	
	
	String iban;
	
	Customer customer;
	
	public BankAccount(String iban, Customer customer) {
		this.iban = iban;
		this.customer = customer;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", customer=" + customer + "]";
	}
	
}
