package org.example.metier;

import org.example.dao.IDao;

public class MetierImp implements IMetier {
    // instanciation statique
    private final IDao iDao;

    public MetierImp(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        return iDao.getData();
    }
}
