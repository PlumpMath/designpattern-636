package com.hyp.face;

import com.hyp.module.ModuleA;
import com.hyp.module.ModuleB;
import com.hyp.module.ModuleC;

/**
 * Created by hyp on 2016/9/5.
 */
public class Facade {
    //示意方法，满足客户端需要的功能
    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
