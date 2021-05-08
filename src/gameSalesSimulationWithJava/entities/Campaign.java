package gameSalesSimulationWithJava.entities;

public class Campaign {
	private int id;
	private int gameId;
	private String name;
	private int discountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, int gameId, String name, int discountRate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.name = name;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
