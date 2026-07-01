package SmartClassroom;

import java.util.*;

public class AttendanceManager {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public void markAttendance(String subject,String student){

        attendance.putIfAbsent(subject,new ArrayList<>());

        ArrayList<String> list = attendance.get(subject);

        if(!list.contains(student))
            list.add(student);
        else
            System.out.println("Duplicate Attendance");
    }

    public void display(){

        for(String subject:attendance.keySet()){

            ArrayList<String> list=attendance.get(subject);

            System.out.println(subject);

            for(String s:list)
                System.out.println(s);

            System.out.println("Total Students : "+list.size());
        }
    }
}