package Ch12;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberlee = new Member(1001,"leeinseok");
        Member memberson = new Member(1002,"sonheungmin");
        Member memberpark = new Member(1003,"jisungpark");
        Member memberkim = new Member(1004,"minjaekim");

        memberArrayList.addMember(memberlee);
        memberArrayList.addMember(memberson);
        memberArrayList.addMember(memberpark);
        memberArrayList.addMember(memberkim);

        memberArrayList.showAllMember();

        memberArrayList.removeMemver(memberkim.getMemberId());
        memberArrayList.showAllMember();
    }
}
