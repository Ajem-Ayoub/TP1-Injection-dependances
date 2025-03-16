package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("org.example");

        IMetier metier =  app.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }

}
