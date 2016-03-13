package com.agroho;/*
 * Created by rezaul on 2016-03-13.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.design.DesignStyle;
import com.agroho.engine.EngineStyle;

public class Car {

    EngineStyle engineStyle;
    DesignStyle designStyle;

    public void drive(){
        System.out.println("Car is moving on");
    }

    public void DesignedMethod(){
        designStyle.designMethod();
    }

    public void EngineChecking(){
        engineStyle.CheckedEngine();
    }


}
