package gameSalesSimulationWithJava.abstracts;

import gameSalesSimulationWithJava.entities.GameUser;

public interface PersonCheckService {
	boolean checkIfRealPerson(GameUser gameUser);
}
