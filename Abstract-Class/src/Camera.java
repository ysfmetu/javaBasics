public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("camera machine");
    }

    @Override
    public void doStuff() {
        System.out.println("doStuff for camera");
    }

    @Override
    public void shutDown() {
        System.out.println("shutDown for camera");
    }
}
