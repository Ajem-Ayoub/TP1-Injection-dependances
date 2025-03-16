package org.example.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImp implements IDao {
    @Override
    public double getData() {
        double t = 14;
        return t;
    }
}
