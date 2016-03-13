package com.agroho;/*
 * Created by rezaul on 2016-03-13.
 * Email:  arezaulalam@gmail.com
 */

import com.agroho.design.DesignStyle;
import com.agroho.design.DesignedInternationally;
import com.agroho.engine.EngineStyle;
import com.agroho.engine.V8CarEngine;

public class MazdaRX8 extends Car{

    public MazdaRX8(){

        EngineStyle mazdaEngine = new V8CarEngine();
        DesignStyle mazdaDesign = new DesignedInternationally();

        mazdaDesign.designMethod();
        mazdaEngine.CheckedEngine();
    }
}
