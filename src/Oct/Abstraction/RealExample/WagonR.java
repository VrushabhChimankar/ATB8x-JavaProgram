package Oct.Abstraction.RealExample;

public class WagonR extends Engine{

    void drive(){

        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    void stopEngine() {

        System.out.println("Stopping Engine");
    }
}
