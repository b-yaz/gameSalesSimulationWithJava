package gameSalesSimulationWithJava.abstracts;

import gameSalesSimulationWithJava.entities.GameUser;

public interface GameUserService {
	void add(GameUser gameUser);
	void update(GameUser gameUser);
	void delete(GameUser gameUser);
}
