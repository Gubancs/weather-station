package hu.mortoff.wcfe.repository;

import hu.mortoff.wcfe.domain.Country;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class CountryRepository {

	private static Map<Long, Country> map;

	static {

		map = new ConcurrentHashMap<Long, Country>(5);
		map.put(1L, new Country(1L, "Magyarország"));
		map.put(2L, new Country(1L, "Spanyolország"));
		map.put(3L, new Country(1L, "Németország"));
		map.put(4L, new Country(1L, "Anglia"));
		map.put(5L, new Country(1L, "Oroszország"));

	}

	public Country find(Long id) {
		return CountryRepository.map.get(id);
	}
}
