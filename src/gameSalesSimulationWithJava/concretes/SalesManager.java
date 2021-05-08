package gameSalesSimulationWithJava.concretes;

import gameSalesSimulationWithJava.abstracts.SalesService;
import gameSalesSimulationWithJava.entities.Game;
import gameSalesSimulationWithJava.entities.GameUser;

public class SalesManager implements SalesService {
	
	@Override
	public void Sell(GameUser gameUser, Game game) {
		System.out.println(game.getName() + " isimli oyun " + gameUser.getFirstName() + " isimli kullanýcýya satýldý.");
		System.out.println("Kampanya sonrasý indirimli fiyat: " + game.getUnitPriceAfterDiscount());
		
	}

}
