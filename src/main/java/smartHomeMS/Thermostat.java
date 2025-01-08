package smartHomeMS;

public class Thermostat extends Device {

    private int temperature;

    public Thermostat(int id, String name, int temperature) {
        super(id, name, DeviceType.THERMOSTAT);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The thermostat is now heating/cooling the room.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The thermostat has been turned off.");
    }

    public void setTemperature(int temperature) {
        if (getStatus()) {
            this.temperature = temperature;
            System.out.println("Temperature set to " + temperature + "°C.");
        } else {
            System.out.println("Thermostat is OFF. Turn it on to set temperature.");
        }
    }

    @Override
    public void performFunction() {
        System.out.println("Regulating room temperature to " + temperature + "°C...");
    }

    @Override
    public String toString() {
        return super.toString() + "Thermostat{" + "temperature=" + temperature + '}';
    }
}