package liquibasedemo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity(name = "customers")
public class Customer extends ModelEntity{
	
	private String name;
	private String surname;
	@Embedded
	private Address address;
	private Date dateOfBirth;
	private int numberOfPurchases;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "purchaser")
	private List<Purchase> purchases;
	
	
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
	public List<Purchase> getPurchases() {
		return purchases;
	}
	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}
	

}
