package gameSalesSimulationWithJava.concretes;

import gameSalesSimulationWithJava.abstracts.PersonCheckService;
import gameSalesSimulationWithJava.entities.GameUser;

public class UserCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(GameUser gameUser) {
		// TODO Auto-generated method stub
		return true;
	}

}
