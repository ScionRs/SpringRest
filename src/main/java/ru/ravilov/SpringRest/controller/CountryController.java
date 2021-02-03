package ru.ravilov.SpringRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ravilov.SpringRest.model.Country;
import ru.ravilov.SpringRest.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> showAllCountries() {
        List<Country> allCountries = countryService.listAll();
        return allCountries;
    }

    @GetMapping("/country/{id}")
    public Country getCountry(@PathVariable Long id) {
        Country country = countryService.get(id);
        return country;
    }

    @PostMapping("/country")
    public Country addNewCountry(@RequestBody Country country) {
        countryService.save(country);
        return country;
    }

    @PutMapping("/country")
    public Country updateCountry(@RequestBody Country country) {
        countryService.save(country);
        return country;
    }

    @DeleteMapping("/country/{id}")
    public String deleteCountry(@PathVariable Long id) {
        Country country = countryService.get(id);
        countryService.delete(id);
        return "Country with ID =" + id + " was deleted";
    }
}
