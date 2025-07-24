package practice4;

class SmartThermostat implements SmartDevice {

    private boolean isOn = false;

    public SmartThermostat(){}

    @Override
    public void turnOn() {
        System.out.println("온도 조절기가 켜졌습니다.");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("온도 조절기가 꺼졌습니다.");
        isOn = false;
    }

    @Override
    public Boolean isToggle() {
        return isOn;
    }
}
