package com.hyp.engine.factory;

import com.hyp.engine.engine.Engine;
import com.hyp.engine.engine.EngineA;
import com.hyp.engine.aircondition.Aircondition;
import com.hyp.engine.aircondition.AirconditionA;

/**
 * Created by hyp on 2016/9/2.
 */
//为宝马320系列生产配件
public class FactoryBMW320 implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}