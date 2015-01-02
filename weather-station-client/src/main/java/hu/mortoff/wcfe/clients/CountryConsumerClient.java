package hu.mortoff.wcfe.clients;

import hu.mortoff.wcfe.domain.Country;
import hu.mortoff.wcfe.ws.CountryService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryConsumerClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"weatherConsumer.xml");

		CountryService countryService = (CountryService) applicationContext
				.getBean("countryClient");

		Country country = countryService.getCountry(2L);

		System.out.println(country);

		applicationContext.close();
	}

}
