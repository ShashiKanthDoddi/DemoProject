package com.Store.Storedemo;

import org.springframework.stereotype.Component;

@Component
public class Build {
    public void play(){
        SecondBuild buildobj = new SecondBuild();
        System.out.println("Playing music");
        buildobj.build2();
    }
}
