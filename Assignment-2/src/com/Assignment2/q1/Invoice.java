package com.Assignment2.q1;

//Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
//An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String),
//a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable. 
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
public class Invoice {

	String partNumber;
	String partDescription;
	int quantity;
	double priceItem;

	public Invoice(String partNumber, String partDescription, int quantity, double priceItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
		if (priceItem < 0) {
			this.priceItem = 0.0;
		} else {
			this.priceItem = priceItem;
		}
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}

	public double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(double priceItem) {
		if (priceItem < 0) {
			this.priceItem = 0.0;
		} else {
			this.priceItem = priceItem;
		}
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", priceItem=" + priceItem + "]";
	}

}
