package ru.ravilov.SpringRest.service;

import org.springframework.stereotype.Service;
import ru.ravilov.SpringRest.model.Country;
import ru.ravilov.SpringRest.repository.CountryRepository;

import java.util.List;

@Service
public class CountryService {


    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> listAll(){
        return countryRepository.findAll();
    }

    public Country save(Country country){
        return countryRepository.save(country);
    }

    public Country get(Long id){
        return countryRepository.findById(id).get();
    }

    public void delete(Long id){
        countryRepository.deleteById(id);
    }

}
