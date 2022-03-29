package com.abc.bean;

// No source code
public class Rocket {

    int rocketId;
    String fuelType;

    public int getRocketId() {
        return rocketId;
    }

    public void setRocketId(int rocketId) {
        this.rocketId = rocketId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void ignite() {
        System.out.println("Rocket Ignited with values rocketId: "+rocketId +" and of fuelType: " +fuelType);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "rocketId=" + rocketId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
