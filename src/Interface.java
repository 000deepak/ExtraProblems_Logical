public class Interface {

    public static void main(String args[]) {
        Car c = new Ferrari();
        c.run();
    }
}
interface Car {
    void run();
}

interface CarSpeed{
    void five();
}

class Ferrari  implements Car , CarSpeed {
    public void run() {
        System.out.println("Ferrari");
    }
    public void five() {

    }
}
class Jaguar implements Car {
    public void run() {
        System.out.println("Jaguar");
    }
}