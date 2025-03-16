package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier {
//    @Autowired
//    @Qualifier("d")
    private IDao idao;


    public MetierImp(@Qualifier("d") IDao idao) {
        this.idao = idao;
    }

//    public MetierImp() {}

    public void setIdao(IDao idao) {
        this.idao = idao;
    }

    @Override
    public double calcul() {
        return idao.getData();
    }

}
