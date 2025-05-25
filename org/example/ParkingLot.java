package org.example;

import org.example.parkingSpots.ParkingSpot;
import org.example.vehicles.Vehicle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot() {
        this.spots = new ArrayList<>();
    }

    public void addSpot (ParkingSpot spot) {
        spots.add(spot);
    }

    public boolean parkVehicle (Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.canFitVehicle(vehicle)) {
                spot.occupySpot();
                System.out.println("Car parked");
                return true;
            }
        }
        System.out.println("Error parking car");
        return false;
    }

    public void removeVehicle(int spotNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.isOccupied() && spot.getSpotNumber() == spotNumber) {
                spot.freeSpot();
                System.out.println("Vehicle removed");
                return;
            }
        }
        System.out.println("Error: Could not remove vehicle from a spot.");
    }

    public void displayAvailableSpots() {
       HashMap<Integer, String> availableSpots = new HashMap<>();
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                availableSpots.put(spot.getSpotNumber(), spot.getClass().getSimpleName());
            }
        }
        System.out.println(availableSpots);
    }
}
