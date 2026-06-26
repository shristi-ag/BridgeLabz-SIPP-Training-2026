package LibraryMembership;

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Student Fine: Rs. " + (overdueDays * 2));
    }
}