package com.agroho.cars;/*
 * Created by rezaul on 2016-03-13.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.Car;
import com.agroho.design.DesignStyle;
import com.agroho.design.DesignedInternationally;
import com.agroho.engine.EngineStyle;
import com.agroho.engine.V8CarEngine;

public class MazdaRX8 extends Car {

    public MazdaRX8(){

        engineStyle = new V8CarEngine();
        designStyle = new DesignedInternationally();


    }

    public void drive(){
        System.out.println("Mazda RX8 is moving on");
    }


}
