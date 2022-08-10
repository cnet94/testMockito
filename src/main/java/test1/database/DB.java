package test1.database;

import test1.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private List<User> userList;

    public DB() {
        userList = new ArrayList<>();
        userList.add(new User(1, "Alex", 26));
        userList.add(new User(2, "Oleg", 20));
        userList.add(new User(3, "Mary", 21));
        userList.add(new User(4, "Yana", 35));
        userList.add(new User(5, "Dima", 15));
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getById(Integer id){
        return getUserList().stream().filter(userId -> userId.getId().equals(id)).findFirst().get();
    }
}
