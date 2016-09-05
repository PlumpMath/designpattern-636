package com.hyp;

/**
 * Created by hyp on 2016/9/2.
 */
class Man extends People{
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.print("男人开着");
        road.run();
    }
}
