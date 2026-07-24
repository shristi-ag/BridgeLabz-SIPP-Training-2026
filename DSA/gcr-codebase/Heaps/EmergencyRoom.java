package Heaps;

import java.util.PriorityQueue;

public class EmergencyRoom {
    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public Patient peekPatient() {
        return triageQueue.peek();
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        er.addPatient(new Patient("John", 5));
        er.addPatient(new Patient("Alice", 10));
        er.addPatient(new Patient("Bob", 7));

        while (!er.triageQueue.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " Severity: " + p.severity);
        }
    }
}