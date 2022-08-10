package test1.service;

import test1.dao.Dao;
import test1.entity.User;

public class Service {
    Dao dao;

    public Service() {
        dao = new Dao();
    }

    public User getUserById(Integer id) {
        User user = dao.getById(id);
        return user;
    }
}
