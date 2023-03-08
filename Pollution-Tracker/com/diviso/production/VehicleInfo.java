import java.util.*;
public class VehicleInfo
{
    private List<Vehicle> vehiclesInfo = new ArrayList<>();
    private String pollutionCentre;
    private Date updatedDate;

    public List<Vehicle> getVehiclesInfo() {return vehiclesInfo;}
    public void setVehiclesInfo(List<Vehicle> vehiclesInfo) {this.vehiclesInfo = vehiclesInfo;}

    public void setPollutionCentre(String pollutionCentre) {this.pollutionCentre = pollutionCentre;}
    public String getPollutionCentre() {return pollutionCentre;}

    public void setUpdatedDate(Date updatedDate) {this.updatedDate = updatedDate;}
    public Date getUpdatedDate() {return updatedDate;}

    @Override
    public String toString() {
        return "vehiclesInfo : " + vehiclesInfo +
                "pollutionCentre : " + pollutionCentre +
               " updatedDate : " + updatedDate ;
    }
}
