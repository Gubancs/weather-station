package hu.mortoff.wcfe.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WeatherService {
	
	@WebMethod
	public String getWeatherForecast();

}
