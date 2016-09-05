package com.hyp.engine.factory;

import com.hyp.engine.engine.Engine;
import com.hyp.engine.engine.EngineB;
import com.hyp.engine.aircondition.Aircondition;
import com.hyp.engine.aircondition.AirconditionB;

/**
 * Created by hyp on 2016/9/2.
 */
//宝马523系列
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }


}