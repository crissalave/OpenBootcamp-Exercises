package com.exercise5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("save method");
    }

    @Override
    public void findAll() {
        System.out.println("findAll method");
    }

    @Override
    public void delete() {
        System.out.println("delete method");
    }
}
