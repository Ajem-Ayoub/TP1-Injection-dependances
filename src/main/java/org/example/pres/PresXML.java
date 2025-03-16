package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXML {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

        IMetier metier =  app.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }
}