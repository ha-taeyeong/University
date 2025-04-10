package practice4;

class SmartTV implements SmartDevice {

    private boolean isOn = false;

    public SmartTV(){}

    @Override
    public void turnOn() {
        System.out.println("TV가 켜졌습니다.");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TV가 꺼졌습니다.");
        isOn = false;
    }

    @Override
    public Boolean isToggle() {
        return isOn;
    }
}
