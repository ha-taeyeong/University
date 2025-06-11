package practice9;

class Student {
    private String name;
    private String phone;

    public Student(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 전화번호 : " + phone;
    }
}
