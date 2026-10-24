import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    private List<Elevator> elevators;

    public ElevatorController(){
        elevators = new ArrayList<>();
        elevators.add(new Elevator());
        elevators.add(new Elevator());
        elevators.add(new Elevator());
    }

    public boolean requestElevator(int floor, RequestType type) {
        //check the bounds for floor
        if(floor < 0 || floor > 9 ) {
            return false;
        }
        if(type == RequestType.DESTINATION) {
            return false;
        }

        Request request = new Request(floor,type);
        Elevator best = selectBestElevator(request);
        if( best == null ) {
            return false;
        }
        return best.addRequest(request);
    }

    public void step(){
        for(Elevator elevator : elevators ){
            elevator.step();
        }
    }

    public Elevator selectBestElevator(Request request) {
        //Elevators moving toward the floor in the right direction
        Elevator best = findCommittedToFloor(request);
        if(best != null) {
            return best;
        }

        best = findNearestIdle(request.getFloor());
        if(best != null){
            return best;
        }

        return findNearest(request.getFloor());
    }

    private Elevator findCommittedToFloor(Request request){
        int floor = request.getFloor();
        RequestType type = request.getType();

        Direction direction = type == RequestType.PICKUP_UP ? Direction.UP : Direction.DOWN;

        Elevator nearest = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator e : elevators){
            if(e.getDirection() != direction) {
                continue;
            }

            if((e.getDirection() == Direction.DOWN && e.getCurrentFloor() < floor ) || (e.getDirection() == Direction.UP && e.getCurrentFloor() > floor )) {
                continue;
            }

            if(!e.hasRequestsAtOrBeyond(floor,direction)) {
                continue;
            }

            int distance = Math.abs(e.getCurrentFloor() - floor);
            if( distance < minDistance ){
                minDistance = distance;
                nearest = e;
            }
        } 

        return nearest;
    }

    private Elevator findNearestIdle(int floor){
        int minDistance = Integer.MAX_VALUE;
        Elevator nearest = null;

        for(Elevator e : elevators){
            if(e.getDirection() != Direction.IDLE){
                continue;
            }

            int distance = Math.abs(e.getCurrentFloor() - floor);
            if(distance < minDistance ) {
                minDistance = distance;
                nearest = e;
            }
        }

        return nearest;
    }

    private Elevator findNearest(int floor){
        int minDistance = Integer.MAX_VALUE;
        Elevator nearest = null;

        for(Elevator e : elevators){
            if(e.getDirection() != Direction.IDLE){
                continue;
            }

            int distance = Math.abs(e.getCurrentFloor() - floor);
            if(distance < minDistance ) {
                minDistance = distance;
                nearest = e;
            }
        }

        return nearest;
    }


}