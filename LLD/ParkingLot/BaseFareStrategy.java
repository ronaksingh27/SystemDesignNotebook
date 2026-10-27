package ParkingLot;

public class BaseFareStrategy implements FareStrategy{
    BigDecimal SMALL_VEHICLE_RATE;
    BigDecimal MEDIUM_VEHICLE_RATE;
    BigDecimal LARGE_VEHICLE_RATE;

    public BigDecimal calculateFare(Ticket ticket,BigDecimal inputFare){
        //ticket -> vehicle -> vehicleSize -> Rate 
        //duration(from Ticket) * inputFare * rate
    }
}
