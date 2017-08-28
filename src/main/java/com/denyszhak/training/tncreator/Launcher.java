package com.denyszhak.training.tncreator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public void launch(){
        String[] contextPaths = new String[] {"spring-config.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
