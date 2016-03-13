package com.agroho;/*
 * Created by rezaul on 2016-03-13.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.design.DesignStyle;
import com.agroho.engine.EngineStyle;

public abstract class Car {

    public EngineStyle engineStyle;
    public DesignStyle designStyle;

    public Car() {

    }


    public abstract void drive();

    public void DesignedMethod() {
        designStyle.designMethod();
    }

    public void EngineChecking() {
        engineStyle.CheckedEngine();
    }

    public void setEngineStyle(EngineStyle es) {
        engineStyle = es;
    }

    public void setDesignStyle(DesignStyle ds) {
        designStyle = ds;
    }

}