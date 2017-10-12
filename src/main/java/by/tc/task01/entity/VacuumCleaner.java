package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    int powerConsumption;
    String filterType;
    String bagType;
    String wandType;
    int motorSpeedRegulation;
    double cleaningWidth;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
        if(!super.equals(vacuumCleaner)){return false;}
        if(powerConsumption != vacuumCleaner.powerConsumption || motorSpeedRegulation != vacuumCleaner.motorSpeedRegulation
                || cleaningWidth != vacuumCleaner.cleaningWidth){return false;}
        if(null == filterType){return (filterType==vacuumCleaner.filterType);}
        else{
            if(!filterType.equals(vacuumCleaner.filterType)){return false; } }
        if(null == bagType){return (bagType==vacuumCleaner.bagType);}
        else{
            if(!bagType.equals(vacuumCleaner.bagType)){return false; } }
        if(null == wandType){return (wandType==vacuumCleaner.wandType);}
        else{
            if(!wandType.equals(vacuumCleaner.wandType)){return false; } }
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*powerConsumption+31*motorSpeedRegulation+31*cleaningWidth+((null==filterType)? 0 : filterType.hashCode())
                +((null==bagType)? 0 : bagType.hashCode())+((null==wandType)? 0 : wandType.hashCode()));
    }

    @Override
    public String toString(){
        return "POWER_CONSUMPTION="+powerConsumption+", FILTER_TYPE="+filterType+", BAG_TYPE="+bagType+
                ", WAND_TYPE="+wandType+", MOTOR_SPEED_REGULATION="+motorSpeedRegulation+", CLEANING_WIDTH="+cleaningWidth;
    }
}
