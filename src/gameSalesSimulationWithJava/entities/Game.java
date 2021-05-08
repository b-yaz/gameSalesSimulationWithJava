package gameSalesSimulationWithJava.entities;

public class Game {
	private int id;
	private String name;
	private double unitPrice;
	private int discountRate;
	
	public Game() {
		
	}
	
	public Game(int id, String name, double unitPrice, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscount() {
		return discountRate;
	}

	public void setDiscount(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPriceAfterDiscount() {
		return (unitPrice - (unitPrice * discountRate / 100));
	}
	
	
}
