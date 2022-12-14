package tn.poly.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.poly.spring.entities.Employe;
import tn.poly.spring.entities.Mission;
import tn.poly.spring.services.IEmployeService;
import tn.poly.spring.services.IEntrepriseService;
import tn.poly.spring.services.ITimesheetService;

@Controller
public class IControllerTimesheetImpl {

	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	ITimesheetService itimesheetservice;

	public int ajouterMission(Mission mission) {
		itimesheetservice.ajouterMission(mission);
		return mission.getId();
	}

	public void affecterMissionADepartement(int missionId, int depId) {
		itimesheetservice.affecterMissionADepartement(missionId, depId);

	}
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
		itimesheetservice.ajouterTimesheet(missionId, employeId, dateDebut, dateFin);

	}

	
	public void validerTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin, int validateurId) {
		itimesheetservice.validerTimesheet(missionId, employeId, dateDebut, dateFin, validateurId);

	}
	public List<Mission> findAllMissionByEmployeJPQL(int employeId) {

		return itimesheetservice.findAllMissionByEmployeJPQL(employeId);
	}


	public List<Employe> getAllEmployeByMission(int missionId) {

		return itimesheetservice.getAllEmployeByMission(missionId);
	}
}
