package project;

public class Member {
    private String memberId;
    private String userName;

    public Member(String memberId, String userName) {
        this.memberId = memberId;
        this.userName = userName;
    }

    public boolean isFanClubMember() {
        return Integer.parseInt(memberId) % 2 == 0; // 짝수일 경우 팬클럽 회원
    }

    public String getMemberId() {
        return memberId;
    }

    public String getUserName() {
        return userName;
    }
}
