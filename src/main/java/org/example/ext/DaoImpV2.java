package org.example.ext;

import org.example.dao.IDao;

public class DaoImpV2 implements IDao {
    @Override
    public double getData(){
        double t = 50.25;
        return t;
    }
}
