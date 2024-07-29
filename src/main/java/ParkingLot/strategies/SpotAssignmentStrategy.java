package ParkingLot.strategies;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingSpot;
import ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType,
                           Gate gate);
}
