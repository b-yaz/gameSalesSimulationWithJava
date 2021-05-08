package gameSalesSimulationWithJava.abstracts;

import gameSalesSimulationWithJava.entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(int id);
	int getDiscountRate(int gameId);
}
