package liquibasedemo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "purchases")
public class Purchase extends ModelEntity{
	
	private Date date;
	@Column(columnDefinition="Decimal(10,2)")
	private double amount;
	@ManyToOne
	private Customer purchaser;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getPurchaser() {
		return purchaser;
	}
	public void setPurchaser(Customer purchaser) {
		this.purchaser = purchaser;
	}
	
	
}
