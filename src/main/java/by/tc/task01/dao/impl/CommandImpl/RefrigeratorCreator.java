package by.tc.task01.dao.impl.CommandImpl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorCreator implements Command {

    public Appliance execute(String[] obj) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt(obj[0]));
        refrigerator.setWeight(Double.parseDouble(obj[1]));
        refrigerator.setFreezerCapacity(Double.parseDouble(obj[2]));
        refrigerator.setOverallCapacity(Double.parseDouble(obj[3]));
        refrigerator.setHeight(Double.parseDouble(obj[4]));
        refrigerator.setWidth(Double.parseDouble(obj[5]));
        return refrigerator;
    }
}
