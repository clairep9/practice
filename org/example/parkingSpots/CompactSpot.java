package org.example.parkingSpots;

import org.example.vehicles.Car;
import org.example.vehicles.HandicappedVehicle;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.Vehicle;

public class CompactSpot extends ParkingSpot {
    public CompactSpot (int spotNumber) {
        super(spotNumber);
    }

    @Override
    public boolean canFitVehicle (Vehicle vehicle) {
        if (vehicle instanceof Car
                || vehicle instanceof Motorcycle
                || vehicle instanceof HandicappedVehicle) {
            return true;
        }
        return false;
    }
}
