package answer4;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", 12345);
        } catch(Exception e) {
            System.out.println(e.getMessage()); // message를 문자열로 출력
        }

        try {
            login("blue", 54321);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void login(String id, int password) throws NotExistIDException, WrongPasswordException {
        //id가 blue가 아니라면 NotExistIDException 발생시킴
        if(!id.equals("blue")) {
            throw new NotExistIDException("존재하지 않는 ID입니다."); // 예외도 객체이므로 new로 생성해야한다.
        }

        //password가 12345가 아니라면 WrongPasswordException 발생시킴
        if(password != 12345) {
            throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
        }
    }
}
