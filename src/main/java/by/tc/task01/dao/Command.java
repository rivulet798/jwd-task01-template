package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;

public interface Command {
     Appliance execute(String[] obj);
}
