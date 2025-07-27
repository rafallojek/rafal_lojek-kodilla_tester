package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
