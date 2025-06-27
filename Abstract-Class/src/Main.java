public class Main {
    public static void main(String[] args) {

        Camera cam1 =new Camera();
        cam1.setId(8);
        Car car1 = new Car();
        car1.setId(6);
       // Machine machine =new Machine();
        car1.run();
        System.out.println("#############################");
        cam1.run();
    }
}