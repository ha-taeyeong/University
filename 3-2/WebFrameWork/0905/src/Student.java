class Student implements StudentInfo{

    private String name;
    private String department;
    private int age;
    private int score;
    private char grade;
    private String passFail;

    private String[] labels = {"이름", "학과", "나이", "성적", " 학점", "합격여부"};

    public Student() {}

    public void inputData(String name, String department, int age, int score) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.score = score;
    }

    public void calculateGrade() {
        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else if(score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void passOrFail() {
        if(score >= 70) {
            passFail = "합격";
        } else {
            passFail = "불합격";
        }
    }

    public void printInfo() {
        String[] labels = {"이름", "학과", "나이", "성적", "학점", "합격여부"};
        String[] values = {
                name,
                department,
                age + "세",
                score + "점",
                grade + "학점",
                passFail
        };

        for(int i = 0; i < labels.length; i++) {
            System.out.println((i+1) + ") " + labels[i] + " : " + values[i]);
        }
    }

}
