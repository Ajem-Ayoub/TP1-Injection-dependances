package org.example.metier;

import org.example.dao.DaoImp;
import org.example.dao.IDao;

public class MetierImp implements IMetier {
    private IDao idao;

    public MetierImp() {}

    public MetierImp(IDao idao) {
        this.idao = idao;
    }

    public void setIdao(IDao idao) {
        this.idao = idao;
    }

    @Override
    public double calcul() {
        return idao.getData();
    }

}
