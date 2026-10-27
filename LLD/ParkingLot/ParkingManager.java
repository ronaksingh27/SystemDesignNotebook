package ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManager {
    Map<VehicleSize, List<ParkingSpot>> availableSpots;
    Map<Vehicle,ParkingSpot> vehicleToSpotMap;

    public ParkingManager(Map<VehicleSize, List<ParkingSpot>> availableSpots) {
        this.availableSpots = availableSpots;
        this.vehicleToSpotMap = new HashMap<>();
    }

    public ParkingSpot findSpotForVehcile(Vehicle vehicle){
        //getSize of Vehicle
        //select from Available Spots as per the Vehicle Size and return it
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        //find the spot for parking
        //then u occupy the spot and update the spotToMap and remove that spot from availableSpots
    }

    public void unparkVehicle(Vehicle vehicle){
        //First check if the spot exists and then getTheSpot of the Vehilce and Unpark/vacate it
    }
}
