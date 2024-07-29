package ParkingLot.factory;

import ParkingLot.models.SpotAssignmentStrategyType;
import ParkingLot.strategies.CheapestSpotAssignmentStrategy;
import ParkingLot.strategies.NearestSpotAssignmentStrategy;
import ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssigmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType){
        if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)){
            return new CheapestSpotAssignmentStrategy();
        }else if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.NEAREST)){
            return new NearestSpotAssignmentStrategy();
        }else{
            return null;
        }
    }
}
