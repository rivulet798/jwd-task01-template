package by.tc.task01.dao.impl.CommandImpl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCCreator implements Command {

    public Appliance execute(String[] obj) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Double.parseDouble(obj[0]));
        tabletPC.setDisplayInches(Double.parseDouble(obj[1]));
        tabletPC.setMemoryRom(Integer.parseInt(obj[2]));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(obj[3]));
        tabletPC.setColor(obj[4]);
        return tabletPC;
    }
}
