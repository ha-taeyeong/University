package week5.practice3;

public class Baby extends Animal {
    public Baby(String type) {
        super(type);
    }

    @Override
    void run(){
        System.out.println(getType() + " : 기어 다닙니다.");
    }

    @Override
    void sound(){
        System.out.println(getType() + " : 옹알이를 합니다.");
    }
}
