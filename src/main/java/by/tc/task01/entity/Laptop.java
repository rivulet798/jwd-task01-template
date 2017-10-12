package by.tc.task01.entity;

public class Laptop extends Appliance{
    double batteryCapacity;
    String OS;
    int memoryRom;
    int systemMemory;
    double CPU;
    double displayInchs;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null){ return false;}
        if(this==obj){ return true;}
        if(getClass()!=obj.getClass()){ return false;}
        Laptop laptop = (Laptop)obj;
        if(!super.equals(laptop)){return false;}
        if(batteryCapacity != laptop.batteryCapacity || memoryRom != laptop.memoryRom
                || systemMemory != laptop.systemMemory || CPU != laptop.CPU || displayInchs != laptop.displayInchs){return false;}
        if(null == OS){return (OS==laptop.OS);}
        else{
            if(!OS.equals(laptop.OS)){return false; } }
        return true;
    }

    @Override
    public int hashCode() {
        return (int)(31*batteryCapacity+31*memoryRom+31*systemMemory+31*CPU+31*displayInchs+((null==OS)? 0 : OS.hashCode()));
    }

    @Override
    public String toString(){
        return "BATTERY_CAPACITY="+batteryCapacity+", OS="+OS+", MEMORY_ROM="+memoryRom+
                ", SYSTEM_MEMORY="+systemMemory+", CPU="+CPU+", DISPLAY_INCHS="+displayInchs;
    }

}
