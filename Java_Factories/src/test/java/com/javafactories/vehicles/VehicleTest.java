package com.javafactories.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carMoveDescribesFourWheels() {
        assertTrue(new Car().move().contains("four"));
    }

    @Test
    void bicycleMoveDescribesTwoWheels() {
        assertTrue(new Bicycle().move().contains("two"));
    }

    @Test
    void startEngineIncludesClassName() {
        assertTrue(new Car().startEngine().contains("Car"));
        assertTrue(new Bicycle().startEngine().contains("Bicycle"));
    }

    @Test
    void carExtendsVehicle() {
        assertInstanceOf(Vehicle.class, new Car());
    }

    @Test
    void bicycleExtendsVehicle() {
        assertInstanceOf(Vehicle.class, new Bicycle());
    }
}
