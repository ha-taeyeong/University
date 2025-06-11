package practice8;

class Member {
    private int number;
    private String name;

    public Member(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "참가번호 " + number + "번 : " + name;
    }
}
