package smartHomeMS;

public class MainApp {

    public static void main(String[] args) {

        SmartHome smartHome = new SmartHome();

        // Create Users
        User user1 = new User("Alice", "Smith", "alice@example.com", "password123");
        User user2 = new User("Bob", "Johnson", "bob@example.com", "securepass");

        // Add users to SmartHome
        smartHome.addUser(user1);
        smartHome.addUser(user2);

        // Create Devices
        Light light1 = new Light(1, "Living Room Light");
        Thermostat thermostat1 = new Thermostat(2, "Bedroom Thermostat",25);
        Camera camera1 = new Camera(3, "Front Door Camera");
        Doorbell doorbell1 = new Doorbell(4, "Main Door Doorbell");

        // Add devices to SmartHome
        smartHome.addDevice(light1);
        smartHome.addDevice(thermostat1);
        smartHome.addDevice(camera1);
        smartHome.addDevice(doorbell1);

        // Interact with devices
        light1.turnOn();
        thermostat1.setTemperature(25);
        camera1.startRecording();
        doorbell1.ring();

        // List all devices
        smartHome.listDevices();

        // Check the status of a specific device
        smartHome.getDeviceStatus(3); // Front Door Camera

        // Remove a device
        smartHome.removeDevice(light1);

        // List devices again
        smartHome.listDevices();
    }
}