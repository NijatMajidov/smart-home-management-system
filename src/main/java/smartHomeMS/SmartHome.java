package smartHomeMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SmartHome {

    private List<User> users;
    private List<Device> devices;

    public SmartHome() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " added to the system.");
    }

    public void removeUser(User user) {
        if (users.remove(user)) {
            System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " removed from the system.");
        } else {
            System.out.println("User not found in the system.");
        }
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device " + device.getName() + " added to the system.");
    }

    public void removeDevice(Device device) {
        if (devices.remove(device)) {
            System.out.println("Device " + device.getName() + " removed from the system.");
        } else {
            System.out.println("Device not found in the system.");
        }
    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                System.out.println("Device " + device.getName() + " is " + (device.getStatus() ? "ON" : "OFF") + ".");
                return device;
            }
        }
        System.out.println("Device with ID " + id + " not found.");
        return null;
    }

    public void listDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices in the system.");
        } else {
            System.out.println("Devices in the system:");
            for (Device device : devices) {
                System.out.println("- " + device.getName() + " (Type: " + device.getDeviceType() + ", Status: " + (device.getStatus() ? "ON" : "OFF") + ")");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartHome smartHome = (SmartHome) o;
        return Objects.equals(users, smartHome.users) && Objects.equals(devices, smartHome.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, devices);
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "users=" + users +
                ", devices=" + devices +
                '}';
    }
}