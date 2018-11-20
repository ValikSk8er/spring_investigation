package com.valiksk8.quoters;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

//    - небуде працювати якшо не прописати лінку на бін через клас     <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
// на етапі ініціалізації ця анотація ще невідома
    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }







}
