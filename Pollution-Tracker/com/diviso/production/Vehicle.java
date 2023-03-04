package com.diviso.production;
import java.util.Date;
import java.util.*;

public class Vehicle
{
    private List<Vehicle> vehiclesInfo = new ArrayList<>();
    private String brandName;
    private String regNo;
    private Date dateInfo = new Date();

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) { this.regNo = regNo;}

    public Date getDate() { return dateInfo;}
    public void setDate(Date dateInfo) { this.dateInfo = dateInfo;}

    public List<Vehicle> getVehiclesInfo() { return vehiclesInfo;}
    public void setVehiclesInfo(List<Vehicle> vehiclesInfo) { this.vehiclesInfo = vehiclesInfo;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehiclesInfo=" + vehiclesInfo +
                ", brandName='" + brandName + '\'' +
                ", regNo='" + regNo + '\'' +
                ", dateInfo=" + dateInfo +
                '}';
    }
}
