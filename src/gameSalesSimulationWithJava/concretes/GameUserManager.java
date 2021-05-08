package gameSalesSimulationWithJava.concretes;

import gameSalesSimulationWithJava.abstracts.GameUserService;
import gameSalesSimulationWithJava.abstracts.PersonCheckService;
import gameSalesSimulationWithJava.entities.GameUser;

public class GameUserManager implements GameUserService {

	private PersonCheckService personCheckService;
	public GameUserManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}
	
	@Override
	public void add(GameUser gameUser) {
		if(personCheckService.checkIfRealPerson(gameUser)) {
			System.out.println(gameUser.getFirstName() + " isimli kullanýcý kontrolden geçti ve kaydedildi.");
		} else {
			System.out.println(gameUser.getFirstName() + " isimli kullanýcý kontrolden geçemedi, kayýt yapýlamadý.");
		}
		
	}

	@Override
	public void update(GameUser gameUser) {
		System.out.println(gameUser.getFirstName() + " isimli kullanýcý kaydý güncellendi.");
		
	}

	@Override
	public void delete(GameUser gameUser) {
		System.out.println(gameUser.getFirstName() + " isimli kullanýcý silindi.");
		
	}

}
