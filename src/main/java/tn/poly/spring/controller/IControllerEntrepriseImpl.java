package tn.poly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.poly.spring.entities.Departement;
import tn.poly.spring.entities.Entreprise;
import tn.poly.spring.services.IEmployeService;
import tn.poly.spring.services.IEntrepriseService;
import tn.poly.spring.services.ITimesheetService;

@Controller
public class IControllerEntrepriseImpl{

	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	ITimesheetService itimesheetservice;

	public int ajouterEntreprise(Entreprise ssiiConsulting) {
		ientrepriseservice.ajouterEntreprise(ssiiConsulting);
		return ssiiConsulting.getId();
	}
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
		ientrepriseservice.affecterDepartementAEntreprise(depId, entrepriseId);
	}
	public void deleteEntrepriseById(int entrepriseId)
	{
		ientrepriseservice.deleteEntrepriseById(entrepriseId);
	}
	public Entreprise getEntrepriseById(int entrepriseId) {

		return ientrepriseservice.getEntrepriseById(1);
	}
	
	public int ajouterDepartement(Departement dep) {
		return ientrepriseservice.ajouterDepartement(dep);
	}
	
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		return ientrepriseservice.getAllDepartementsNamesByEntreprise(entrepriseId);
	}

	public void deleteDepartementById(int depId) {
		ientrepriseservice.deleteDepartementById(depId);

	}
}
