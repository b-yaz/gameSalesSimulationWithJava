package gameSalesSimulationWithJava;

import java.text.SimpleDateFormat;

import gameSalesSimulationWithJava.adapters.MernisServiceAdapter;
import gameSalesSimulationWithJava.concretes.CampaignManager;
import gameSalesSimulationWithJava.concretes.GameUserManager;
import gameSalesSimulationWithJava.concretes.SalesManager;
import gameSalesSimulationWithJava.entities.Campaign;
import gameSalesSimulationWithJava.entities.Game;
import gameSalesSimulationWithJava.entities.GameUser;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			
			GameUserManager gameUserManager = new GameUserManager(new MernisServiceAdapter());
			GameUser gameUser = new GameUser();
			gameUser.setFirstName("Kenan");
			gameUser.setLastName("Kulaz");
			gameUser.setNationalityId("11111111111");
			gameUser.setDateOfBirth(new SimpleDateFormat("dd.MM.yyyy").parse("01.01.1982"));
			gameUserManager.add(gameUser);
			
			CampaignManager campaignManager = new CampaignManager();
			campaignManager.add(new Campaign(1, 1, "Bayram Kampanyasý", 10));
			
			int discountRate = campaignManager.getDiscountRate(1);
			Game game = new Game(1, "Dawn of Ware", Double.valueOf(100.0), discountRate);
			
			SalesManager salesManager = new SalesManager();
			salesManager.Sell(gameUser, game);
			
			campaignManager.update(new Campaign(1, 1, "Bayram Kampanyasý", 20));
			campaignManager.delete(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
