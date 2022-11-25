package com.exercise4;

import java.util.Dictionary;
import java.util.Enumeration;

public class SmartPhone extends SmartDevice{
    public static final String DEFAULT_ASSOCIATE_NUMBER = "00-000000";
    public static final String DEFAULT_LOGIN_METHOD = "PIN";

    private String associateNumber;
    private String loginMethod;
    private Dictionary contactList;

    /**
     * CONSTRUCTORS
     */
    public SmartPhone() {
        this(DEFAULT_ASSOCIATE_NUMBER, DEFAULT_LOGIN_METHOD);
    }

    public SmartPhone(String associateNumber, String loginMethod) {
        super();
        this.associateNumber = associateNumber;
        this.loginMethod = loginMethod;
    }

    public SmartPhone(double size, double ram, double storage, String brand, String model) {
        super(size, ram, storage, brand, model);
        this.associateNumber = DEFAULT_ASSOCIATE_NUMBER;
        this.loginMethod = DEFAULT_LOGIN_METHOD;
    }

    public SmartPhone(double size, double ram, double storage, String brand, String model, String associateNumber, String loginMethod) {
        this(size, ram, storage, brand, model);
        this.associateNumber = associateNumber;
        this.loginMethod = loginMethod;
    }

    public void call(String number) {
        if (number.length() < 10) System.out.println("Incorrect number");

        System.out.println("calling ...");
        System.out.println("> Hello?");
    }

    public void addContact(String name, String number) {
        if (name.length() <= 0 || number.length() <= 0) {
            System.out.println("incorrect name or number");
            return;
        }

        contactList.put(name, number);
    }

    public void getContactInfo(String name) {
        String number = (String) contactList.get(name);

        System.out.println("Person Info");
        System.out.println("Name: " +  name);
        System.out.println("Number: " + number);
    }

    public void deleteContact(String name) {
        String deletedContact = (String) contactList.remove(name);

        if (deletedContact != "null") System.out.println("deleted contact");
        System.out.println("contact doesn't exist");
    }

}
