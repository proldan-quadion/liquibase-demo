package liquibasedemo.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity(name = "customers")
public class Customer extends ModelEntity{
	
	private String name;
	private String surname;
	private String address;
	private Date dateOfBirth;
	private int numberOfPurchases;
	private double amountSpent;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getNumberOfPurchases() {
		return numberOfPurchases;
	}
	public void setNumberOfPurchases(int numberOfPurchases) {
		this.numberOfPurchases = numberOfPurchases;
	}
	
	public double getAmountSpent() {
		return amountSpent;
	}
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}

}
