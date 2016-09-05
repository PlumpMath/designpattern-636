package com.hyp.flyweight;

/**
 * Created by hyp on 2016/9/5.
 */
public class ConcreteFlyweight extends Flyweight{
    private String string;
    public ConcreteFlyweight(String str){
     string = str;
    }
    public void operation()
    {
        System.out.println("Concrete---Flyweight : " + string);
    }
}
