package ParkingLot;

import java.math.BigDecimal;
import java.util.List;

public class FareCalculator {
    List<FareStrategy> fareStrategies;

    //Contructor Injection to get fareStrategies

    public BigDecimal calculateFare(Ticket ticket){
        //Go through all strategies and select one to calculate the fare for a ticket based on the strategy
    }
}
