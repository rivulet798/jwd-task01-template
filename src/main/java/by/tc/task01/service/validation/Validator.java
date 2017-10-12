package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
	private static String intValues = new String("POWER_CONSUMPTION"+"MEMORY_ROM"+"SYSTEM_MEMORY"+"MOTOR_SPEED_REGULATION"
	+"NUMBER_OF_SPEAKERS");
	private static String stringValues = new String("OS"+"FILTER_TYPE"+"BAG_TYPE"+"WAND_TYPE"+"COLOR");
	private static String rangeValues = new String("FREQUENCY_RANGE");
	private static String doubleValues = new String("WEIGHT"+"CAPACITY"+"DEPTH"+"HEIGHT"+"WIDTH"+"BATTERY_CAPACITY"+"CPU"
	+"DISPLAY_INCHS"+"FREEZER_CAPACITY"+"OVERALL_CAPACITY"+"CLEANING_WIDTH"+"DISPLAY_INCHES"+"FLASH_MEMORY_CAPACITY"+"CORD_LENGTH");
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		for(Map.Entry<E,Object> map:criteria.getMap().entrySet()){

			if(map.getValue()==null){return false;}

			if (intValues.contains(map.getKey().toString())){
				try{
					Integer.parseInt(map.getValue().toString());
				}catch(NumberFormatException e){
					System.out.println("Введено нецелое значение для категории "+map.getKey()+" прибора "+criteria.getApplianceType() );
					return false;
				}
			}

			if(stringValues.contains(map.getKey().toString())){
				if(map.getValue().toString()==null || map.getValue().toString().length()==0){
					System.out.println("Введено неверное значение для категории "+map.getKey()+" прибора "+criteria.getApplianceType());
					return false;
				}
			}

			if (rangeValues.contains(map.getKey().toString())){
				String range = new String(map.getValue().toString());
				if(!range.matches("\\d+(\\.\\d+)?-\\d+(\\.\\d+)?")){
					System.out.println("Введен не диапазон для категории "+map.getKey()+" прибора "+ criteria.getApplianceType());
					return false;
				}
			}

			if(doubleValues.contains(map.getKey().toString())){
				try{
					Double.parseDouble(map.getValue().toString());
				}catch(NumberFormatException e){
					System.out.println("Введено не число для категории "+map.getKey()+" прибора "+criteria.getApplianceType() );
					return false;
				}
			}
		}
		return true;
	}

}
