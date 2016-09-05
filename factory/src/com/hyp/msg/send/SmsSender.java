package com.hyp.msg.send;

/**
 * Created by hyp on 2016/9/2.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}