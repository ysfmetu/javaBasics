public class Car extends Machine{
    @Override
    public void start() {
        System.out.println("Car machine");
    }

    @Override
    public void doStuff() {
        System.out.println("doSturf for car");
    }

    @Override
    public void shutDown() {
        System.out.println("shutdown for car");

    }
}
