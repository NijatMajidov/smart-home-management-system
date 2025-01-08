package smartHomeMS;

import java.util.Objects;

public abstract class Device {

    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String name, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.deviceType = deviceType;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void turnOn() {
        status = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " is now OFF.");
    }

    public abstract void performFunction();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id && status == device.status && Objects.equals(name, device.name) && deviceType == device.deviceType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, deviceType);
    }

    @Override
    public String toString() {
        return "Device{ id=" + id + ", name='" + name + '\'' + ", status=" + status + ", deviceType=" + deviceType + '}';
    }
}