package com.epam.trainee.subtask6;

import com.epam.trainee.subtask6.electical.ElectricalClockFactory;
import com.epam.trainee.subtask6.mechanical.MechanicalClockFactory;

public class Runner {

    public static void main(String[] args) {
        AbstractClockFactory mechanicalClockFactory = new MechanicalClockFactory();
        AbstractClockFactory electricalClockFactory = new ElectricalClockFactory();

        Clock elWallClock = electricalClockFactory.createWallsClock();
        Clock elTableClock = electricalClockFactory.createTableClock();
        Clock elWristClock = electricalClockFactory.createWristWatch();
         
        Clock mTableClock = mechanicalClockFactory.createTableClock();
        Clock mWallClock = mechanicalClockFactory.createWallsClock();
        Clock mWristClock = mechanicalClockFactory.createWristWatch();

        System.out.println(elWallClock.getTime());
        System.out.println(elTableClock.getTime());
        System.out.println(elWristClock.getTime());
        
        System.out.println(mWallClock.getTime());
        System.out.println(mTableClock.getTime());
        System.out.println(mWristClock.getTime());
    }
}
