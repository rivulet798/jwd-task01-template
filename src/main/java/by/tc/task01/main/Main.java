package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.CAPACITY, 3);
		criteriaOven.setApplianceType("Oven");

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.setApplianceType("Oven");

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.setApplianceType("TabletPC");

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<Speakers>();
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 4);
		criteriaSpeakers.setApplianceType("Speakers");

		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<VacuumCleaner>();
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "AA");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 4);
		criteriaVacuumCleaner.setApplianceType("VacuumCleaner");

		appliance = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliance);
	}

}
