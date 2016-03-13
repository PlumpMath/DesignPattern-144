package com.agroho.cars;/*
 * Created by rezaul on 2016-03-13.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.Car;
import com.agroho.design.DesignStyle;
import com.agroho.design.DesignedInternationally;
import com.agroho.engine.EngineStyle;
import com.agroho.engine.V6CarEngine;

public class BMWM8 extends Car {

    public BMWM8(){

        designStyle = new DesignedInternationally();
        engineStyle = new V6CarEngine();

    }

    public void drive(){
        System.out.println("BMW M8 is moving on");
    }

    public void carShowCasing(){
        System.out.println("This is BMW M8");
    }
}
