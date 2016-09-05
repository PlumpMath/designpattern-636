package com.hyp.engine.factory;

import com.hyp.engine.engine.Engine;
import com.hyp.engine.aircondition.Aircondition;

/**
 * Created by hyp on 2016/9/2.
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}