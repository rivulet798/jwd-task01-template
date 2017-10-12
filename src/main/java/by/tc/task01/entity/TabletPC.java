package by.tc.task01.entity;

public class TabletPC extends Appliance{
    double batteryCapacity;
    double displayInches;
    int memoryRom;
    double flashMemoryCapacity;
    String color;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        TabletPC tabletPC = (TabletPC) obj;
        if(!super.equals(tabletPC)){return false;}
        if(batteryCapacity != tabletPC.batteryCapacity || displayInches != tabletPC.displayInches
                || memoryRom != tabletPC.memoryRom || flashMemoryCapacity != tabletPC.flashMemoryCapacity){return false;}
        if(null == color){return (color==tabletPC.color);}
        else{
            if(!color.equals(tabletPC.color)){return false; } }
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*batteryCapacity+31*displayInches+31*memoryRom+31*flashMemoryCapacity+((null==color)? 0 : color.hashCode()));
    }

    @Override
    public String toString(){
        return "BATTERY_CAPACITY="+batteryCapacity+", DISPLAY_INCHES="+displayInches+", MEMORY_ROM="
                +memoryRom+ ", FLASH_MEMORY_CAPACITY="+flashMemoryCapacity+", COLOR="+color;
    }
}
