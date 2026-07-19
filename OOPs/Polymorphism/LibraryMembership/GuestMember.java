package LibraryMembership;

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Guest Fine: Rs. " + (overdueDays * 5));
    }
}