package ParkingLot;

public class Car implements Vehicle {
    String licensePlateNumber;
    VehicleSize vehicleSize;

    //Constructor Injection
    public Car(String licensePlateNumber, VehicleSize vehicleSize){
        this.licensePlateNumber = licensePlateNumber;
        this.vehicleSize = vehicleSize;
    }

    @Override 
    public String getLicensePlate(){
        return this.licensePlateNumber;
    }

    @Override
    public VehicleSize getVehicleSize(){
        return this.vehicleSize;
    }


}
