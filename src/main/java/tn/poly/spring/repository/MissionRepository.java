package tn.poly.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.poly.spring.entities.Mission;


public interface MissionRepository extends CrudRepository<Mission, Integer> {

}
