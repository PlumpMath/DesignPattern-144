package com.agroho;

import com.agroho.cars.BMWM8;
import com.agroho.cars.MazdaRX8;
import com.agroho.design.DesignedLocally;
import com.agroho.engine.V8CarEngine;

public class Main {

    public static void main(String[] args) {

        Car rx81 = new MazdaRX8();

        rx81.DesignedMethod();
        rx81.EngineChecking();
        rx81.drive();

        Car bmwm8 = new BMWM8();
        bmwm8.setEngineStyle(new V8CarEngine());
        bmwm8.setDesignStyle(new DesignedLocally());
        bmwm8.DesignedMethod();
        bmwm8.EngineChecking();
        bmwm8.drive();




    }
}
