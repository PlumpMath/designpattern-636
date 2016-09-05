package com.hyp;

/**
 * Created by hyp on 2016/9/2.
 */
public class Test {

    public static void main(String[] args) {

        AbstractRoad speedWay = new SpeedWay();
        speedWay.aCar = new Car();

        People man = new Man();
        man.road = speedWay;
        man.run();
    }

//    public static void main(String[] args){
//
//        AbstractRoad speedWay = new SpeedWay();
//        speedWay.aCar = new Car();
//        speedWay.run();
//
//        AbstractRoad street = new Street();
//        street.aCar = new Bus();
//        street.run();
//    }



}
