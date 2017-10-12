package by.tc.task01.dao.impl.CommandImpl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenCreator implements Command {

    public Appliance execute(String[] obj) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt(obj[0]));
        oven.setWeight(Double.parseDouble(obj[1]));
        oven.setCapacity(Double.parseDouble(obj[2]));
        oven.setDepth(Double.parseDouble(obj[3]));
        oven.setHeight(Double.parseDouble(obj[4]));
        oven.setWidth(Double.parseDouble(obj[5]));
        return oven;
    }
}