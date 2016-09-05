package com.hyp;

/**
 * Created by hyp on 2016/9/2.
 */
class SpeedWay extends AbstractRoad{
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        aCar.run();
        System.out.println("在高速公路行驶");
    }
}
