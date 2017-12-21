package ua.training.subtask3;

public class Test {

    public static void main(String[] args) {

        Gun planeGun = new PlaneGun(5);
        MilitaryPlane militaryPlane = new MilitaryPlane(planeGun);

        militaryPlane.shoot(); //not shooting now
        militaryPlane.fly();
        militaryPlane.fly(); //nothing happen

        militaryPlane.shoot();
        militaryPlane.shoot();
        militaryPlane.shoot();
        militaryPlane.shoot();
        militaryPlane.shoot();
        militaryPlane.shoot(); //not shooting now
        militaryPlane.recharge();
        militaryPlane.shoot();
        militaryPlane.shoot();

        militaryPlane.land();
        militaryPlane.land(); //nothing happen

        militaryPlane.shoot(); //not shooting now
        militaryPlane.recharge();
        militaryPlane.fly();

        /*another set of shooting*/
        militaryPlane.shoot();
        militaryPlane.shoot();
        militaryPlane.shoot(); //after this shoot gun has no bullets
        militaryPlane.shoot(); //not shooting now
        militaryPlane.land();
    }
}
