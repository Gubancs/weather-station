package hu.mortoff.wcfe.ws;

import hu.mortoff.wcfe.domain.Country;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CountryService {

	@WebMethod
	public Country getCountry(Long countryId);
	
}
