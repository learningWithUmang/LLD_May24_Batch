package ParkingLot.models;

import java.util.List;

public class ParkingSpot extends BaseModal{
    private ParkingSpotStatus parkingSpotStatus;
    private int parkingSpotNo;
    private List<VehicleType> vehicleTypeList;
    private ParkingFloor parkingFloor;

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getParkingSpotNo() {
        return parkingSpotNo;
    }

    public void setParkingSpotNo(int parkingSpotNo) {
        this.parkingSpotNo = parkingSpotNo;
    }

    public List<VehicleType> getVehicleTypeList() {
        return vehicleTypeList;
    }

    public void setVehicleTypeList(List<VehicleType> vehicleTypeList) {
        this.vehicleTypeList = vehicleTypeList;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}

/*(
PARKING FLOOR - LIST OF PARKING SPOTS
PARKING FLOOR : PARKING SPOT MAPPING ALREADY DONE?
SPOT : FLOOR AGAIN?

FOR EVERY FLOOR, WE HAVE TO GET ALL SPOTS :-
    FOR ALL SPOTS , IF WE FIND OUR SPOT - THAT FLOOR IS THE ANSWER

PARKING FLOOR : PARKING SPOT
 1  : M
 1 :  1
 1 : M => ID OF FLOOR IN SPOT

SPOT - FLOOR?
 */