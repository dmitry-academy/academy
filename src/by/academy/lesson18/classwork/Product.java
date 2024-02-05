package by.academy.lesson18.classwork;

import java.io.Serializable;

public abstract class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String type;
	protected String name;
	protected double price;
	protected double quantity;

	public Product() {
		super();
	}

	public Product(String type, String name, double price, double quantity) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	protected final double getProductPrice() {
		return price * quantity * getDiscount();
	}

	protected abstract double getDiscount();

	public double getFullPrice() {
		return quantity * price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [type=");
		builder.append(type);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
