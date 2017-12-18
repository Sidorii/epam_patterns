package com.epam.trainee.subtask3;

public class MilitaryPlane implements Plane, Gun {

    private Gun gun;
    private MilitaryPlaneState state;

    public MilitaryPlane(Gun gun) {
        this.gun = gun;
        state = new OnTheGroundState();
    }

    public void fly() {
        state.fly();
    }

    public void land() {
        state.land();
    }

    public void shoot() {
        state.shoot();
    }

    public void recharge() {
        state.recharge();
    }

    private class InAirState implements MilitaryPlaneState {

        public void fly() {
        }

        public void land() {
            System.out.println("Plane is landing...");
            state = new OnTheGroundState();
        }

        public void shoot() {
            gun.shoot();
        }

        public void recharge() {
            gun.recharge();
        }
    }

    private class OnTheGroundState implements MilitaryPlaneState {

        public void fly() {
            System.out.println("Plane starting to fly...");
            state = new InAirState();
        }

        public void land() {
        }

        public void shoot() {
        }

        public void recharge() {
            gun.recharge();
        }
    }
}
