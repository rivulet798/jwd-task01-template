package by.tc.task01.dao.impl.CommandImpl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersCreator implements Command {

    public Appliance execute(String[] obj) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt(obj[0]));
        speakers.setNumberOfSpeakers(Integer.parseInt(obj[1]));
        speakers.setFrequencyRange(obj[2]);
        speakers.setCordLength(Double.parseDouble(obj[3]));
        return speakers;
    }
}
