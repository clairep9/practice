package org.example;

import org.example.parkingSpots.CompactSpot;
import org.example.parkingSpots.HandicappedSpot;
import org.example.parkingSpots.RegularSpot;
import org.example.vehicles.Car;
import org.example.vehicles.HandicappedVehicle;
import org.example.vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        CompactSpot compact = new CompactSpot(1);
        RegularSpot regular = new RegularSpot(2);
        HandicappedSpot handicapped = new HandicappedSpot(3);

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addSpot(compact);
        parkingLot.addSpot(regular);
        parkingLot.addSpot(handicapped);

        Car car = new Car("abc123");
        Motorcycle motorcycle = new Motorcycle("def456");
        HandicappedVehicle handicappedVehicle = new HandicappedVehicle("ghi789");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(motorcycle);
        parkingLot.parkVehicle(handicappedVehicle);

        parkingLot.displayAvailableSpots();

        parkingLot.removeVehicle(2);

        parkingLot.displayAvailableSpots();

    }
}
