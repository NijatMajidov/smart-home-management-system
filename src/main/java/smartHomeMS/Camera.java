package smartHomeMS;

public class Camera extends Device {

    private boolean isRecording;

    public Camera(int id, String name) {
        super(id, name, DeviceType.CAMERA);
        this.isRecording = false;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The camera is now active.");
    }

    @Override
    public void turnOff() {
        if (isRecording) stopRecording();
        super.turnOff();
        System.out.println("The camera has been turned off.");
    }

    public void startRecording() {
        if (getStatus()) {
            isRecording = true;
            System.out.println("Camera has started recording.");
        } else {
            System.out.println("Camera is OFF. Turn it on to start recording.");
        }
    }

    public void stopRecording() {
        isRecording = false;
        System.out.println("Camera has stopped recording.");
    }

    @Override
    public void performFunction() {
        System.out.println("Capturing video feed...");
    }

    @Override
    public String toString() {
        return super.toString() + "Camera{" + "isRecording=" + isRecording + '}';
    }
}