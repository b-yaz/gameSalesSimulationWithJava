package gameSalesSimulationWithJava.concretes;

import gameSalesSimulationWithJava.abstracts.CampaignService;
import gameSalesSimulationWithJava.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getName());
	}

	@Override
	public void delete(int id) {
		System.out.println("Kampanya silindi.");
	}

	@Override
	public int getDiscountRate(int gameId) {
		return 10;
	}
}
