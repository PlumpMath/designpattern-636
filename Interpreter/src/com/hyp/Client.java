package com.hyp;

/**
 * Created by hyp on 2016/9/5.
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context("10");

        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        new MinusExpression().interpret(context);
        new PlusExpression().interpret(context);
        System.out.println(context.getOut());
    }
}