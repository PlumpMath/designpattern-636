package com.hyp.msg.factory;

import com.hyp.msg.send.MailSender;
import com.hyp.msg.send.Sender;
import com.hyp.msg.send.SmsSender;

/**
 * Created by hyp on 2016/9/2.
 */
public class SendFactory {

//    public Sender produce(String type) {
//        if ("mail".equals(type)) {
//            return new MailSender();
//        } else if ("sms".equals(type)) {
//            return new SmsSender();
//        } else {
//            System.out.println("请输入正确的类型!");
//            return null;
//        }
//    }

    /**
     * 22、多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。关系图：
     * @return
     */
        public Sender produceMail(){
            return new MailSender();
        }

        public Sender produceSms(){
            return new SmsSender();
        }




}