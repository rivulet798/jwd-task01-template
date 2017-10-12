package by.tc.task01.entity;

public class Oven extends Appliance{
    int powerConsumption;
    double weight;
    double capacity;
    double depth;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        Oven oven = (Oven)obj;
        if(!super.equals(oven)){return false;}
        if(powerConsumption != oven.powerConsumption || weight != oven.weight
                || capacity != oven.capacity || depth != oven.depth || height != oven.height || width != oven.width){return false;}
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*powerConsumption+31*weight+31*capacity+31*depth+31*height+31*width);
    }

    @Override
    public String toString(){
        return "POWER_CONSUMPTION="+powerConsumption+", WEIGHT="+weight+", CAPACITY="+capacity+
                ", DEPTH="+depth+", HEIGHT="+height+", WIDTH="+width;
    }
}
