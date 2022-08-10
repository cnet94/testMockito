package test1.controller;

import test1.service.Service;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        service.getUserById(1);
    }
}
