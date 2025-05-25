package org.example.parkingSpots;

import org.example.vehicles.Car;
import org.example.vehicles.HandicappedVehicle;
import org.example.vehicles.Vehicle;

public class RegularSpot extends ParkingSpot {
    public RegularSpot(int spotNumber) {
        super (spotNumber);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car || vehicle instanceof HandicappedVehicle) {
            return true;
        }
        return false;
    }
}
