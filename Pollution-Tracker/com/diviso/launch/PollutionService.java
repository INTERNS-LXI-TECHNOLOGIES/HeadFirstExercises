package com.diviso.launch;
import com.diviso.production.*;
import java.text.ParseException;
import java.util.*;
public class PollutionService
{
    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() { return vehicles;}
    public void setVehicles(List<Vehicle> vehicles) { this.vehicles = vehicles;}

    public static void main(String[] args) throws ParseException {
        ViewController view = new ViewController();
        view.viewInfoOne();
        view.viewControl();
    }
}

