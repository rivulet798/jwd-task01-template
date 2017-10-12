package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if(appliance!=null){System.out.println("Прибор найден "+appliance.toString());}
		else {System.out.println("Прибор не найден");}
	}

}
