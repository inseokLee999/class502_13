package exam02;

public class SportCar extends Car{
    public void start() {
        System.out.println("Start SportsCar");
    }

    public void press() {
        System.out.println("Accelerate");
    }

    public void turnoff() {
        System.out.println("System Off");
    }
/*
    public void run(){
        start();
        turnoff();
        press();
    }
*/
}
