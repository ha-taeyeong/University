package practice4;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();
        SmartDevice tv = new SmartTV();

        //장치 제어
        controller.controlDevice(light);
        controller.controlDevice(light);
        controller.controlDevice(thermostat);
        controller.controlDevice(thermostat);
        controller.controlDevice(tv);
        controller.controlDevice(tv);
    }

}
