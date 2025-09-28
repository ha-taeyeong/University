package practice4;

class SmartLight implements SmartDevice {
    private String controlDevice;
    private boolean isOn = false;

    public SmartLight() {}

    @Override
    public void turnOn() {
        System.out.println("조명이 켜졌습니다.");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("조명이 꺼졌습니다.");
        isOn = false;
    }

    @Override
    public Boolean isToggle() {
        return isOn;
    }
}
