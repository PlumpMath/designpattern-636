package com.hyp;

/**
 * Created by hyp on 2016/9/5.
 */
/**
 * 文件名称：Context.java
 * 创建人：Fei Wong
 * 创建时间： Jun 25, 2012
 * 电子邮箱：feiwong8@126.com
 *  解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等
 * */

public class Context {
    private String in ;

    private int out ;

    public Context(String in) {
        this.in = in ;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.in = String.valueOf( out ) ;
        this.out = out;
    }

    public String getIn() {
        return in;
    }


}


