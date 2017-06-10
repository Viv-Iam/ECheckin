package com.innovach.echeckin.moringa;

import java.util.ArrayList;

/**
 * Created by vivian on 10/06/17.
 */

public class Name {
    private String mName;
    private boolean mCheckin;

    public Name(String name, boolean checkin) {
        mName = name;
        mCheckin = checkin;
    }

    public String getName() {
        return mName;
    }

    public boolean isCheckedin() {
        return mCheckin;
    }

    private static int lastContactId = 0;

    public static ArrayList<Name> createContactsList(int numContacts) {
        ArrayList<Name> contacts = new ArrayList<Name>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Name("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}