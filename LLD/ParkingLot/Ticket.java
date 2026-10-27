package ParkingLot;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    //Use constructor injection to get these varaibles

    public BigDecimal calculateParkingDuration(){
        //diff = exitTime - entryTime
    }
}
