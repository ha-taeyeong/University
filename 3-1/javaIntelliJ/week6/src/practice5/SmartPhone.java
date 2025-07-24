package practice5;

class SmartPhone implements RemoteControl {
    private String name;
    private int volume;
    private boolean mute;

    public SmartPhone() {
        this.name = "SmartPhone";
        this.volume = 0;
        this.mute = false;
    }

    @Override
    public void turnOn(){
        System.out.println(name + "을 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println(name + "을 끕니다.");
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("---- " + name + " 볼륨을 " + volume + "으로 합니다 ----");
    }
    @Override
    public void setMute(boolean mute) { //디폴트 메소드
        if(mute) {
            System.out.println("---- " + name + " 볼륨을 무음으로 합니다 ----");
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    @Override
    public String toString() {
        return "현재 " + name + " 볼륨: " + volume;
    }

}
