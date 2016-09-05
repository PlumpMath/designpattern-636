package com.hyp;

/**
 * Created by hyp on 2016/9/2.
 */
class Street extends AbstractRoad{
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        aCar.run();
        System.out.println("在市区街道行驶");
    }
}
