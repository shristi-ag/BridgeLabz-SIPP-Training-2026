package LibraryMembership;

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Faculty Fine: Rs. " + (overdueDays * 1));
    }
}