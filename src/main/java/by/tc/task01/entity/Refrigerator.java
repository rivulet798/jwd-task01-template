package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    int powerConsumption;
    double weight;
    double freezerCapacity;
    double overallCapacity;
    double height;
    double width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double widht) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        Refrigerator refrigerator = (Refrigerator) obj;
        if(!super.equals(refrigerator)){return false;}
        if(powerConsumption != refrigerator.powerConsumption || weight != refrigerator.weight
                || freezerCapacity != refrigerator.freezerCapacity || overallCapacity != refrigerator.overallCapacity
                || height != refrigerator.height || width != refrigerator.width){return false;}
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*powerConsumption+31*weight+31*freezerCapacity+31*overallCapacity+31*height+31*width);
    }

    @Override
    public String toString(){
        return "POWER_CONSUMPTION="+powerConsumption+", WEIGHT="+weight+", FREEZER_CAPACITY="+freezerCapacity+
                ", OVERALL_CAPACITY="+overallCapacity+", HEIGHT="+height+", WIDTH="+width;
    }
}
