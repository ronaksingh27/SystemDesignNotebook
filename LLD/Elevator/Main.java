public class Main {
    public static void main(){
        ElevatorController evc = new ElevatorController();
        evc.requestElevator(5,RequestType.PICKUP_UP);

        //think of cases
        //currentFloor = x, UP = y, DOWN = z, DESTINATION = w | Their PnCs should genrate many scenarios of the state of the system
    }
}
