package com.epam.trainee.subtask3;

public class PlaneGun implements Gun {

    private final int FULL_BULLETS_PACK;

    private GunState state;
    private long bulletsCount;

    public PlaneGun(int bulletsCount) {
        FULL_BULLETS_PACK = bulletsCount;
        this.bulletsCount = FULL_BULLETS_PACK;
        state = new ShootingState();
    }

    public void shoot() {
        state.shoot();
    }

    public void recharge() {
        state.recharge();
    }

    private class ShootingState implements GunState {

        public void shoot() {
            if (bulletsCount <= 0) {
                state = new NotShootingState();
                state.shoot();
                return;
            }
            bulletsCount--;
            System.out.println("Gun made shoot!");
        }

        public void recharge() {
        }
    }

    private class NotShootingState implements GunState {

        public void shoot() {
        }

        public void recharge() {
            bulletsCount = FULL_BULLETS_PACK;
            state = new ShootingState();
        }
    }
}
