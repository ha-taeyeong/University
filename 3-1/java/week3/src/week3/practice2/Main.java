package week3.practice2;

public class Main {
    public static void main(String[] args) {
        // GameItem의 싱글톤 인스턴스를 가져옴
        GameItem item = GameItem.getInstance();
        
        // 아이템 사용
        item.useItem();
        
        // 또 다른 인스턴스를 가져와 사용 시도
        GameItem anotherItem = GameItem.getInstance();
        anotherItem.useItem();
        
        // 두 참조 변수가 같은 인스턴스를 가리키는지 확인
        if (item == anotherItem) {
            System.out.println("두 참조 변수가 같은 인스턴스를 가리킵니다.");
        } else {
            System.out.println("참조 변수가 다른 인스턴스를 가리킵니다.");
        }
    }
}