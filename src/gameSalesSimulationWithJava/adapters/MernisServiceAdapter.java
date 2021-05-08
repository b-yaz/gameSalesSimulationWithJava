package gameSalesSimulationWithJava.adapters;

import java.rmi.RemoteException;
import java.util.Calendar;

import gameSalesSimulationWithJava.abstracts.PersonCheckService;
import gameSalesSimulationWithJava.entities.GameUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(GameUser gameUser) {
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(gameUser.getDateOfBirth());
			
			result = client.TCKimlikNoDogrula(Long.parseLong(gameUser.getNationalityId()), gameUser.getFirstName().toUpperCase(), gameUser.getLastName().toUpperCase(), cal.get(Calendar.YEAR));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
