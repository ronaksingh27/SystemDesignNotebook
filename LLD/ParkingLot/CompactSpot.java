package ParkingLot;

public class CompactSpot implements ParkingSpot{
    int spotNumber;
    Vehicle vehicle;

    public CompactSpot(int spotNumber, Vehicle vehicle){
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
    }

    @Override 
    public boolean isAvailable(){
        return vehicle == null;
    }

    @Override
    public void occupy(Vehicle vehicle){
        if(isAvailable()){
            this.vehicle = vehicle;
        }
        else {
            //Spot is already occupied
        }
    }

    @Override 
    public void vacate(){
        this.vehicle = null;
    }

    @Override 
    public int getSpotNumber(){
        return this.spotNumber;
    }

    @Override 
    public VehicleSize getVehicleSize(){
        return VehicleSize.SMALL;
    }

}
