//package com.innovach.echeckin;
//
//import java.util.List;
//
///**
// * Created by vivian on 10/06/17.
// */
//
//public class Name {
//    String name;
//    boolean checkin;
//
//    public Name() {}
//
//    public Name(String name, boolean checkin) {
//        this.name = name;
//        this.checkin = checkin;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isCheckedin() {
//        return checkin;
//    }

//    private static int lastContactId = 0;
//
//    public static ArrayList<Name> createContactsList(int numContacts) {
//        ArrayList<Name> contacts = new ArrayList<Name>();
//
//        for (int i = 1; i <= numContacts; i++) {
//            contacts.add(new Name("Person " + ++lastContactId, i <= numContacts / 2));
//        }
//
//        return contacts;
//    }