package gameSalesSimulationWithJava.abstracts;

import gameSalesSimulationWithJava.entities.Game;
import gameSalesSimulationWithJava.entities.GameUser;

public interface SalesService {
	void Sell(GameUser gameUser, Game game);
}
