package lampstate;

public class Brightest implements State {
    @Override
    public void tekan(LampContext context) {
        System.out.print("Lampu sangat terang");
        context.setState(new TurnOff());
        System.out.println("to TunrOff");
    }
}