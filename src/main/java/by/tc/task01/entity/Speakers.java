package by.tc.task01.entity;

public class Speakers extends Appliance{
    int powerConsumption;
    int numberOfSpeakers;
    String frequencyRange;
    double cordLength;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        Speakers speakers = (Speakers)obj;
        if(powerConsumption != speakers.powerConsumption || numberOfSpeakers != speakers.numberOfSpeakers
                || cordLength != speakers.cordLength){return false;}
                if(null == frequencyRange){return (frequencyRange==speakers.frequencyRange);}
                else{
                    if(!frequencyRange.equals(speakers.frequencyRange)){return false; } }
                    return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*powerConsumption+31*numberOfSpeakers+31*cordLength+((null==frequencyRange)? 0 : frequencyRange.hashCode()));
    }

    @Override
    public String toString(){
        return "POWER_CONSUMPTION="+powerConsumption+", NUMBER_OF_SPEAKERS="+numberOfSpeakers+
                ", FREQUENCY_RANGE="+frequencyRange+ ", CORD_LENGTH="+cordLength;
    }
}
