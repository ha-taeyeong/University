package week3.practice2;

public class GameItem {
    // 이른 초기화 방식으로 싱글톤 인스턴스를 생성
    private static GameItem instance = new GameItem();
    
    // 인스턴스 생성을 방지하기 위한 private 생성자
    private GameItem() {
        // 초기화 코드 여기에
    }

    // 인스턴스에 대한 접근을 제공하는 공개 메소드
    public static GameItem getInstance() {
        return instance;
    }

    // GameItem 클래스의 다른 메소드와 속성
    public void useItem() {
        // 아이템을 사용하는 코드
        System.out.println("아이템 사용!");
    }
}
