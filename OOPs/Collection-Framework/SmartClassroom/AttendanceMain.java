package SmartClassroom;

public class AttendanceMain {

    public static void main(String[] args) {

        AttendanceManager a = new AttendanceManager();

        a.markAttendance("Java","Shristi");
        a.markAttendance("Java","Aman");
        a.markAttendance("Java","Shristi");

        a.markAttendance("SQL","Riya");

        a.display();
    }
}