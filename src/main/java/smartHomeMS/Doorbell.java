package smartHomeMS;

public class Doorbell extends Device {

    public Doorbell(int id, String name) {
        super(id, name, DeviceType.DOORBELL);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The doorbell is now active.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The doorbell has been turned off.");
    }

    public void ring() {
        if (getStatus()) {
            System.out.println("Doorbell is ringing!");
        } else {
            System.out.println("Doorbell is OFF. Turn it on to ring.");
        }
    }

    @Override
    public void performFunction() {
        System.out.println("Monitoring door activity...");
    }
}