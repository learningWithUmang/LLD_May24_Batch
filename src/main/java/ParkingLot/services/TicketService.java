package ParkingLot.services;

import ParkingLot.exceptions.GateNotFoundException;
import ParkingLot.factory.SpotAssigmentStrategyFactory;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(Long gateId,
                              String vehicleNo,
                              String ownerName,
                              VehicleType vehicleType) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setCreatedAt(new Date());

        //Get the gate object from the database using the gateId
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if(optionalGate.isEmpty()){
            throw new GateNotFoundException();
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        //Get the vehicle with the vehicle number, if present, use it otherwise create a new vehicle object
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNo);
        Vehicle savedVehicle;

        if(optionalVehicle.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNo(vehicleNo);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicleRepository.save();
            savedVehicle = vehicle;
        }else{
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);
        ParkingLot parkingLot = parkingLotRepository.getParkingLot();
        SpotAssignmentStrategyType spotAssignmentStrategyType = parkingLot.getSpotAssignmentStrategy();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssigmentStrategyFactory.getSpotAssignmentStrategy(spotAssignmentStrategyType);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicleType,gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setTicketNo("TICKET_" + gateId + "_" + ticket.getGeneratedAt());
        ticketRepository.save(ticket);

        return ticket;

    }
}
