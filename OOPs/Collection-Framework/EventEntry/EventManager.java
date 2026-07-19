package EventEntry;

import java.util.*;

public class EventManager {

    HashSet<String> participants = new HashSet<>();

    public void register(String email) {

        if(participants.add(email))
            System.out.println("Registration Successful");
        else
            System.out.println("Duplicate Registration");
    }

    public void display() {

        for(String s:participants)
            System.out.println(s);

        System.out.println("Total = "+participants.size());
    }
}