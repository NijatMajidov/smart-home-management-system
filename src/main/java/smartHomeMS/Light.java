package smartHomeMS;

public class Light extends Device {

    public Light(int id, String name) {
        super(id, name, DeviceType.LIGHT);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The light has been switched on.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The light has been switched off.");
    }

    @Override
    public void performFunction() {
        System.out.println("Adjusting light intensity...");
    }
}