package by.tc.task01.dao;

import java.util.HashMap;
import java.util.Map;
import by.tc.task01.dao.impl.CommandImpl.*;

public class ApplianceDirector {
    Map<String, Command> map = new HashMap<String, Command>();

    public ApplianceDirector(){
        map.put("Oven", new OvenCreator());
        map.put("Laptop", new LaptopCreator());
        map.put("Refrigerator", new RefrigeratorCreator());
        map.put("VacuumCleaner", new VacuumCleanerCreator());
        map.put("TabletPC", new TabletPCCreator());
        map.put("Speakers", new SpeakersCreator());
    }

    public Command getCommand(String typeName){// "Laptop"
        Command command;
        command = map.get(typeName);
        return command;
    }
}
