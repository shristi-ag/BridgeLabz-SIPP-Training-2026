package LibraryMembership;

public class SmartLibraryMembershipSystem {

    public static void main(String[] args) {

        LibraryMember[] members = new LibraryMember[3];

        members[0] = new StudentMember("Shristi", "S101");
        members[1] = new FacultyMember("Rahul", "F201");
        members[2] = new GuestMember("Priya", "G301");

        int overdueDays = 4;

        System.out.println("----- Member Details -----");

        for (LibraryMember member : members) {
            member.printDetails();
            member.calculateFine(overdueDays);
            System.out.println();
        }

        // Search Member by ID
        String searchId = "F201";
        boolean found = false;

        System.out.println("Searching for Member ID: " + searchId);

        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("Member Found!");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }
}