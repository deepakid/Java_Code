package AbstractKey;

public class Main {
    public static void main(String[] args) {
       Aeroplane ref1 = new Cargoplane();
       ref1.takeOff();
       ref1.fly();

       Aeroplane ref2 = new Passengerplane();
       ref2.takeOff();
       ref2.fly();
    }
}
