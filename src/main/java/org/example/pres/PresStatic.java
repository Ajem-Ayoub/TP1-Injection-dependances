package org.example.pres;

import org.example.dao.DaoImp;
import org.example.dao.IDao;
import org.example.metier.MetierImp;

public class PresStatic {
    public static void main(String[] args) {
        IDao dao = new DaoImp();
        MetierImp metier = new MetierImp(dao);
        System.out.println(metier.calcul());
    }
}
