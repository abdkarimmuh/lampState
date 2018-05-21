package lampstate;

public class Brighter implements State {
    @Override
    public void tekan(LampContext context) {
        System.out.print("Lampu sangat terang");
        context.setState(new Brightest());
        System.out.println("to Brightest");
    }
}