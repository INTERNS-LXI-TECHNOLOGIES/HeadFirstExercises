package com.diviso.production;

import java.util.ArrayList;
import java.util.List;

public class PollutionService
{
    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() { return vehicles;}
    public void setVehicles(List<Vehicle> vehicles) { this.vehicles = vehicles;}

    public static void main(String[] args)
    {
        ViewController view = new ViewController();
        view.viewInfo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

