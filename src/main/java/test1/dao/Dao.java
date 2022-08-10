package test1.dao;

import test1.database.DB;
import test1.entity.User;

public class Dao {

    DB db;

    public Dao() {
        db = new DB();
    }

    public User getById(Integer id) {
        return db.getById(id);
    }
}
