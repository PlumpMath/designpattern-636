package com.hyp;

import java.util.ArrayList;

/**
 * Created by hyp on 2016/9/2.
 */

/**
 * 深拷贝
 */
public class Prototype implements Cloneable {
    private ArrayList list = new ArrayList();
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}