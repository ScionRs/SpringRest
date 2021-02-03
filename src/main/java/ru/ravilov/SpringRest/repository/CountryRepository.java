package ru.ravilov.SpringRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ravilov.SpringRest.model.Country;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
