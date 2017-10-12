package by.tc.task01.dao.impl.CommandImpl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopCreator implements Command {

    public Appliance execute(String[] obj) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(obj[0]));
        laptop.setOS(obj[1]);
        laptop.setMemoryRom(Integer.parseInt(obj[2]));
        laptop.setSystemMemory(Integer.parseInt(obj[3]));
        laptop.setCPU(Double.parseDouble(obj[4]));
        laptop.setDisplayInchs(Double.parseDouble(obj[5]));
        return laptop;
    }
}
