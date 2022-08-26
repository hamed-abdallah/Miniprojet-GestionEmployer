package tn.poly.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.poly.spring.entities.Employe;
import tn.poly.spring.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Integer>  {
	
	
}
