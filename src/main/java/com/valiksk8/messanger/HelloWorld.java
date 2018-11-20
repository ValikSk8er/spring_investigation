package com.valiksk8.messanger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {

        version1();
        version2(args);
        version3();
        helloWorldDecoupledWithFactory();
        springVersion();
    }

    public static void version1() {
        System.out.println("-------v1------");

        System.out.println("Hello world!");
    }


    public static void version2(String[] args) {
        System.out.println("-------v2------");

        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello world!");
        }
    }

    public static void version3() {
        System.out.println("-------v3------");

        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }

    public static void helloWorldDecoupledWithFactory() {
        System.out.println("-------v4 HelloWorldDecoupledWithFactory------");

        MessageRenderer mr = MessageSupportFactory.getInstance()
                .getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance()
                .getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

    public static void springVersion() {
        System.out.println("-------v5 springVersion------");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
        System.out.println("-------springVersion completed------");
    }
}
